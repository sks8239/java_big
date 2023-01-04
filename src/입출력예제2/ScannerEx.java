package 입출력예제2;

import java.io.IOException;
import java.util.Scanner;

//System.in.read() : 키보드 입력을 ASCII 코드값으로 읽어 들임
// Scanner 입력 : 키보드의 입력 원하는 데이터 타입으로 반환
public class ScannerEx {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        short b = sc.nextShort();
        int c = sc.nextInt();
        char ch = sc.next().charAt(0);
        String s1 = sc.next(); //문자열을 공백 단위로 입력 받음
        String s2 = sc.nextLine(); // 문자열을 줄바꿈 기준으로 입력 받음
        }
    }
