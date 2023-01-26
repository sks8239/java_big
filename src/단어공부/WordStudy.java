package 단어공부;

import java.util.Scanner;

public class WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단어를 입력하세요 : ");
        String word = sc.next();
        int alphabet[] = new int[word.length()];
        word.toLowerCase();
        for(int i=0; i<word.length(); i++) {
            for(int j=1; j<word.length(); j++){ // s k s a b c
                if(word.charAt(i)==word.charAt(j)){
                }
            }
            System.out.println(alphabet[i]);
        }

    }
}
