package 단어공부;

import java.util.Scanner;

public class WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단어를 입력하세요 : ");
        String word = sc.next();
        int alphabet[] = new int[26];
        int max = 0;
        char out = '?';
        for(int i=0; i<word.length(); i++) {
            if('A' <= word.charAt(i) && word.charAt(i)<= 'Z'){ //대문자 구간
                alphabet[word.charAt(i) - 'A']++;
            }else{ // 소문자 구간
                alphabet[word.charAt(i) - 'a']++;
            }
        }
        for(int i=0; i<26; i++){
            if(alphabet[i]>max){
                max = alphabet[i];
                out = (char)(i+65); // 대문자 출력 +65
            }else if (alphabet[i] == max){
                out = '?';
            }
        }
        System.out.println(out);
    }
}
