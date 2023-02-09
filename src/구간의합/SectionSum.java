package 구간의합;

import java.util.Scanner;

public class SectionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int num[] = new int[m];
        int sum[] = new int[n];
        for(int i=0; i<m; i++){
            num[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            for(int j = start-1; j<end; j++){
                sum[i] += num[j];
            }
        }
        for(int e : sum) System.out.println(e);
    }
}
