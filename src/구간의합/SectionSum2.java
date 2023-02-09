package 구간의합;

import java.util.Arrays;
import java.util.Scanner;

public class SectionSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int num[] = new int[m];
        int sum[] = new int[m];
        int out[] = new int[n];
        for(int i=0; i<m; i++) {
            num[i] = sc.nextInt();
            if (i == 0) {
                sum[i] = num[i];
            } else {
                sum[i] = sum[i - 1] + num[i];
            }
        }
        for(int i=0; i<n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            if (start == 1) {
                out[i] = sum[end - 1];
            } else {
                out[i] = sum[end - 1] - sum[start - 2];
            }
        }
        for(int e : out) System.out.println(e);
    }
}