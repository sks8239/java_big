package 더하기싸이클;

import java.util.Arrays;
import java.util.Scanner;

public class PlusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String a = num;
        int b = 0;
        int cnt = 0;
        String newNum[] = new String[2];
        if (num.length() < 2) {
            num = num + 0;
            a= num;
        }
        String firstNum[] = new String[num.length()];
        while (true) {
            firstNum[0] = String.valueOf(num.charAt(0));
            firstNum[1] = String.valueOf(num.charAt(1));
            b = Integer.valueOf(firstNum[0]) + Integer.valueOf(firstNum[1]);
            newNum[0] = firstNum[1];
            newNum[1] = String.valueOf(b);
            num = firstNum[1] + b % 10;
            cnt++;
            if (a.equals(num)) {
                break;
            }
        }System.out.print(cnt);
    }
}
// 0 -> 10    1+0 = 1   01   0+1=1 11 1+1=2 12 1+2=3

