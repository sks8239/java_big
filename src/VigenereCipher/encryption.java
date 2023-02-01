package VigenereCipher;

import java.util.Scanner;

public class encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String plain = sc.nextLine();
        //암호화 완료된 문장을 담을 배열
        char out[] = new char[plain.length()];
        while (plain.length() > key.length()) {
            key = key + key;
        }
        //구현부
        for (int i = 0; i < plain.length(); i++) {
            if (plain.charAt(i) == ' ') {
                out[i] = ' ';
            } else {
                char value = (char) (plain.charAt(i) - (key.charAt(i))+'a'-1);
                if (value < 'a') value += 26;
                out[i] = value;
            }
        }
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i]);
        }
    }
}