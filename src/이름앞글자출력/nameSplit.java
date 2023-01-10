package 이름앞글자출력;

import java.util.Scanner;

public class nameSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        /*문자 배열로 변경 후 대문자 추출
        String str = sc.next();
        char[] chName = str.toCharArray();
        for(char e : chName){
            if(e>= 'A' && e <= 'Z')System.out.print(e);

         */

/* 첫번째문자 추출 + 하이픈 다음문자 추출
       String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) System.out.print(str.charAt(i));
            else {
                if (str.charAt(i) == '-') System.out.print(str.charAt(i + 1));
            }

 */

/* 대문자 추출
        String str = sc.next();
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                System.out.print(str.charAt(i));
            }
        }
 */
//하이픈기준으로 split()한 후 찾기
        String[] str = sc.next().split("-");
        int length = str.length;
        for (int i = 0; i < length; i++) {
            System.out.print(str[i].charAt(0));
        }
    }
}