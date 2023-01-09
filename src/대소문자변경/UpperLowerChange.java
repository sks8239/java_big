package 대소문자변경;

import java.util.Scanner;

//영문자 소문자와 대문자로만 이루어진 단어를 입력 받은 뒤, 대문자는 소문자로, 소문자는 대문자로 변경하기
public class UpperLowerChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단어를 입력하세요 : ");
        String a = sc.next();
        String output = "";
        int tmp;
        for (int i = 0; i < a.length();i++) {
            tmp = (int)a.charAt(i);
            if ((tmp >= 65)&&(tmp<=90)) {
                output +=(char)(tmp+32);
            } else if ((tmp>=97)&&(tmp<=122)) {
                output+=(char)(tmp-32);
            }
        }
        System.out.println(output);
    }
}
