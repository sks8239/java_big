package 메소드연습;

import java.util.Scanner;

public class ClassMethod {
    public static void main(String[] args) {
        Sample sample = new Sample(); //생성자 호출시 전달하는 매개변수가 없음
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값 입력 : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rst = sample.sum(n1,n2); //sum()메소드 호출부에서 인수로 값을 전달
        System.out.println(rst);
        sample.say(); // say()메소드를 호출하기 위해서는 클래스홀 객체로 만들고 객체의 메소드로 접근
        System.out.println(sample.sayStr());

        int rst2 = sample.sum(1,2,3,4,5);
        System.out.println(rst2);
    }
}
