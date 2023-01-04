package 비트연산자;
// 비트 연산자 : 비트 단위로 연산을 수행 (1/0)
// & (비트 AND) : 두개의 비트가 모두 1이면 1
// | (비트 OR) : 둘 중 하나의 비트만 1이어도 1
// ^(XOR) : 두 개의 비트 값이 같으면 0 다르면 1
// ~ (NOT) : 비트 값을 반전
// << (Shift 연산자) : 지정된 수만큼 왼쪽으로 비트를 이동
// >> (Shift 연산자) : 지정된 수만큼 오른쪽으로 비트를 이동
public class BitOperator {
    public static void main(String[] args){
        int num1 = 10; //1010
        int num2 = 12; //1100
        System.out.println(num1 & num2); // 1000 = 8
        System.out.println(num1 | num2); // 1110 = 14
        System.out.println(num1 ^ num2); // 0110 = 6
        System.out.println(~num1); // -11
        System.out.println(num1 << 1); //0001 0100 = 24
        System.out.println(num1 >> 1); // 0000 0101 = 5
    }
}
