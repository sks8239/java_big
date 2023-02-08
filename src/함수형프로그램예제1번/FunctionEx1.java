package 함수형프로그램예제1번;
// 함수형프로그램이란 : 자바8에서 도입, 수학공식과 유사, 불변성의 원칙, 조건문, 반복문 사용금지 등의 특징을 가짐
// 람다(Lambda) : 화살표 표현식으로 사용됨. 생략 가능한 모든 것을 생략하는 것을 기본원칙으로 함
// 함수형 인터페이스 : 자바는 함수가 독립적으로 존재할 수 없ㅇ므로 함수형 인터페이스를 필요로 함

@FunctionalInterface
interface Calculator{
    int sum(int a, int b);
}
@FunctionalInterface
interface MyFuncInterface{
    int min(int x, int y);
}

public class FunctionEx1 {
    public static void main(String[] args) {
        Calculator mc = (a,b) -> a+b;
        int rst = mc.sum(3,4);
        System.out.println(rst);

        MyFuncInterface mfi = (x,y) -> x < y ? x : y;
        System.out.println(mfi.min(3,4));
    }
}
