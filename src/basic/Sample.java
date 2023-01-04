package basic; //접근제한자(캡슐화)와 연관성이 있음

//접근제한자 : public, protected, default, private
/*
주석이란? 사람은 이해하고 컴파일러는 무시하는 영역
 */

public class Sample { //클래스 이름을 지정, 클래스 이름은 관례상 첫자를 대문자로 사용
    //main 메소드는 프로그램의 시작 위치를 의미하며 JVM이 호출함.
    //void는 메소드 실행 이후의 반환 타입 중 하나이다.
    // {} 중괄호 : 클래스, 메소드 등의 범위를 결정
    // () 소괄호 : 메소드의 매개변수를 넣는 곳
    // [] 대괄호 : 배열 등을 정의 할 때 사용됨
    public static void main(String[] args) {
        System.out.println("Hello java");
    }
}
