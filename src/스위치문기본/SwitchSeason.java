package 스위치문기본;

import java.util.Scanner;

// 스위치문은 조건문이며 스위치에는 조건식은 올 수 없고, 조건에 대한 변수만 올 수 있음
// 변수는 정수, 문자, 문자열만 사용 가능
// 스위치의 각 케이스를 끝내기 위해서는 반드시 break문이 필요
// 해당하는 케이스가 없는 경우를 위해 defalut문이 필요
public class SwitchSeason {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요: ");
        String season = sc.next();
        switch(season){
            case "SPRING" :
            case "spring" :
                System.out.print("봄");
                break;
            case "summer" :
            case "SUMMER" :
                System.out.print("여름");
                break;
            case "fall" :
            case "FALL" :
            case "AUTUMN" :
            case "autumn" :
                System.out.print("가을");
                break;
            case "winter" :
            case "WINTER" :
                System.out.print("겨울");
                break;
            default :
                System.out.print("잘못입력하셨습니다.");
        }
    }
}
