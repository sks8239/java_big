package 문자열연결;

import java.util.Scanner;

// 문자열 추가하기
// 첫번째 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수값 입력 : 2
// 첫번째 문자열에서 입력 받은 정수 갯수 만큼의 문자를 뒤에서부터 잘라서, 두번째 문자열 앞에 추가하기
// ulkorea
public class StringAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열을 입력하세요 : ");
        String str = sc.next();
        System.out.print("두번째 문자열을 입력하세요 : ");
        String str2 = sc.next();
        System.out.print("정수 값을 입력하세요 : ");
        int num = sc.nextInt();
        if (num > str.length()) {
            System.out.print("문자열보다 큰 정수값은 입력할 수 없습니다.");
        } else {
            String a = str.substring(str.length() - num);
            System.out.print(a + str2);
        }
    }
}
