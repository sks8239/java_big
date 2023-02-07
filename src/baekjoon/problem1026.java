package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class problem1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int out = 0;
        int c=0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            for (int j = 1; j < n; j++) {
                if(a[i] > a[j]) {
                    c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }        System.out.println(Arrays.toString(a));
            }
        }

    }
}
// 1 9 4 2 3
// 1