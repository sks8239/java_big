package 입출력스트림예제1번;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class InOutStreamEx1 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("test.bin");
        byte[] array = {10, 20, 30, 40, 50};
        os.write(array,1,3); //배열 1부터 4개를 출력

        os.flush(); //write()이후에는 반드시 버퍼 비우는 동작이 필요
        os.close(); // 자원반납 및 스트림 닫기
    }
}
