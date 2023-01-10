package 시간입력;

import java.util.Scanner;

// 입력 : 23:5:3 (24시간제로 시간을 콜론(:) 기준으로 입력)
// 출력 : 오후 11시 05분 03초
public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하세요 : ");
        String[] time = sc.next().split(":");
        int a = Integer.parseInt(time[0]);
        int b = Integer.parseInt(time[1]);
        int c = Integer.parseInt(time[2]);
        if(a>12){
            System.out.printf("오후 " + (a-12) +"시 " + "%02d분 %02d초", b, c);
        }else{
            System.out.printf("오후 " + a +"시 " + "%02d분 %02d초", b, c);
        }
    }
}
