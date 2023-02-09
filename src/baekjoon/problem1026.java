package baekjoon;

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
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] > a[j] && b[i] > b[j]) {
                    c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                } else if(a[i] < a[j] && b[i] < b[j]){
                    c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            sum += a[i]*b[i];
        }
        System.out.print(sum);
    }
}