package 숫자의합;

import java.util.Scanner;

public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String number = sc.next();
            int sum = 0;
            String num[] = new String[number.length()];
            for (int i = 0; i < num.length; i++) {
                num[i] = String.valueOf(number.charAt(i));
            }
            for(int i=0; i<num.length;i++) {
                sum += Integer.valueOf(num[i]);
            }
            if(sum == 0){
                System.out.println("프로그램 종료");
                break;
            }else{
                System.out.println(sum);
            }
        }
    }
}
