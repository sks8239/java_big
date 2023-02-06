package 배열을사용하지않고10진수2진수변경;

import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String binary = "";
        String out = "";
        int realOut=0;
        while (true) {
            if (num % 2 == 1) {
                binary = binary + "1"; //홀수면 2진수 끝자리 1
            } else {
                binary = binary + "0"; //짝수면 2진수 끝자리 0
            }
            num = num / 2;
            if (num < 1) {
                break;
            }
        }
        for (int i = binary.length() - 1; i >= 0; i--) {
            out = out + binary.charAt(i);
        }
        System.out.println(out);
            for (int i = 0; i < out.length(); i++) {
                realOut +=  Integer.parseInt(String.valueOf(binary.charAt(i))) * (int)Math.pow(2,i);
            }
        System.out.println(realOut);
        }
    }
