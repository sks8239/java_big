package 제일큰값찾기;

import java.util.Scanner;

// 세자리 정수를 입력 받아서 100의 자리, 10의 자리, 1의 자리로 나누어 담고
// 그 중 가장 큰 수 찾기
public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int a = value / 100;
        int b = (value % 100) / 10;
        int c = value % 10;
        if (a > b) {
            System.out.println(Math.max(a, c));
        } else {
            System.out.println(Math.max(b, c));
        }
    }
}


// a>b>c , a>c>b, b>c>a, b>a>c, c>a>b, c>b>a