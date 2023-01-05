package 반복문연습문제1번;

import java.util.Scanner;

public class SquareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d ", j+(i*n));
            }
            System.out.print("\n");
        }
    }
}
