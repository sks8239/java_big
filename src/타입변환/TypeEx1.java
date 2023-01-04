package 타입변환;
// 묵시적 형변환(Auto) : 컴파일러가 유리한 방향으로 형변환을 해주는 것
// 명시적 형변환 : 개발자가 의도한대로 형변환을 하는 것
// 메소드를 이용한 형변환 : Integer.parseInt(); 문자열을 정수 타입으로 변경
// Double.parseDouble() : 문자열을 실수 타입으로 변경
// 진수 표현 : 10진수, 16진수, 8진수, 2진수

public class TypeEx1 {

    public static void main(String[] args){
        /*
        int num1 = 1, num2 = 4;
        double rst1 = num1/num2; //문제 발생 코드
        double rst2 = (double)num1/num2;
        System.out.println(rst1);
        System.out.println(rst2);

        String phoneNumber = "01054949348";
        String name = "곰돌이사육사";

        int number = Integer.parseInt(phoneNumber);
        System.out.println(number);
 */
        int var1 = 0b1010; //2진수 10
        int var2 = 0267; //8진수
        int var3 = 399;
        int var4 = 0x100abd;
        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
    }
}
