package 나혼자연습;

import java.util.Scanner;

public class practiceEx1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하세요 00 00 형식\n");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        System.out.print(hour + "시" + minute + "분");


    }
}
