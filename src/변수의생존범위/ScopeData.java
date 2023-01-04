package 변수의생존범위;

import java.util.Scanner;

//자바에서 상수는 fianl 키워드로 정의하고 단. 한번만 값을 설정할 수 있음
public class ScopeData {
    public static void main(String[] args){
       double taxRate = 0.10;
       Scanner sc = new Scanner(System.in);
       System.out.print("당신의 수입을 입력 하세요 : ");
       int income = sc.nextInt();
       System.out.println("당신이 내야 할 세금은 " + income * taxRate +" 입니다");
    }
}
