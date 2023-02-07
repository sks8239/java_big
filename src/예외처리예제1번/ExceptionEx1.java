package 예외처리예제1번;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionEx1 {
    public static void main(String[] args) {
        FileWriter f = null; // 참조 변수에 초기값 대입
        try {
            f = new FileWriter("test.txt");
            f.write("Hello Java");
        } catch (IOException e) {
            e.printStackTrace(); // 디버깅용으로 사용하며 에러에 대한 Call Stack 저장
            // 어떤 발생하더라도 반드시 실행되어야 할 구문이 있으면 finally에 적어 줌
        } finally {
            if(f != null) {
                try {
                    f.close(); // 쓰기 위한 파일을 열고 난 다음 다 사용한 후 자원 반납하고 진행
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
