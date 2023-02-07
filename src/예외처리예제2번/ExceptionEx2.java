package 예외처리예제2번;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("없는파일"));
            br.readLine();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("파일이 없습니다.");
        }
    }
}
