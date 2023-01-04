package 연산자연습1;

import java.util.Scanner;

// 산술연자 : +, -, *, /, %
// 대입연산자 : 값을 변수에 대입할 때 사용
// 복합대입연산자 : 연산 후 대입
// 증감연산자 : 값으 1증가하거나 감소시키는 연산자
// 삼항 연산자 : 항이 3개인 연산자 ( 이건 참과 거짓이 있는 조건문과 같음)
// 문자열 결합 연산자 : 문자열을 이어주는 연산자
public class OperatorEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        boolean isAdult = (age >19) ? true : false;

        System.out.println(isAdult);

        }
    }
