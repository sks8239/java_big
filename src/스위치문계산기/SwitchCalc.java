package 스위치문계산기;

import java.util.Scanner;

public class SwitchCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("계산식을 입력하세요 : ");
        int x = sc.nextInt(); //연산자의 좌변값을 입력받음
        char op = sc.next().charAt(0); // 문자열에서 첫번째 문자를 추출
        int y = sc.nextInt();
        switch(op){
            case '+' :
                System.out.println("덧셈 : " + (x + y));
                break;
            case '-' :
                System.out.println("뺄셈 : " + (x - y));
                break;
            case '*' :
                System.out.println("곱셈 : " + (x * y));
                break;
            case '/' :
                System.out.println("나눗셈 : " + (x / y));
                break;
            case '%' :
                System.out.println("나머지 : " + (x % y));
                break;
            default :
                System.out.println("연산자를 잘못 입력하셨습니다.");
        }
    }
}
