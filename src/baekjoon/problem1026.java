package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class problem1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = a[0];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) { // i=0, j=1
            for (int j = n - 1; j >= 0; j--) {
                if (i != j) {
                    if (a[i] >= a[j] && b[i] >= b[j]) {
                        c = a[j];
                        a[j] = a[i];
                        a[i] = c;
                    }else if(a[i] <= a[j] && b[i] <= b[j]);
                    c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                    }
                }
            }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < n; i++) {
            sum += a[i]*b[i];
        }
        System.out.println(sum);
    }
}
                    /* 3 0 0 39 31 26 15 5 100

                       5 15 100 31 39 0 0 3 26
                       3 15 100 31 39 0 0 5 26
                       0 15 100 31 39 0 3 5 26
                       0 5 100 31 39 0 3 15 26
                       0 3 100 31 39 0 5 15 26
                       0 0 100 31 39 3 5 15 26
                       0 0 31 100 39 3 5 15 26


                       11 12 13 2 3 4 5 9 1
                     */