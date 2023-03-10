package 입출력스트림예제2번;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// InputStream : 바이트 기반 입력스트림의 최상위 클래스로 추상 클래스 입니다.

public class InOutStreamEx2 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("test.bin");
        byte[] buffer = new byte[100];
        while(true){
//            int data = is.read(); // 1 바이트 씩 읽기
//            if(data == -1) break; // 파일의 끝에 도달
//            System.out.print(data + " ");
            int readByteNum = is.read(buffer,1,2); // 매개변수로 전달한 buffer에 값을 담음
            if(readByteNum == -1) break;
            for(int i = 0; i <buffer.length; i++){
                if(buffer[i]!=0) System.out.print(buffer[i] + " ");
            }
        }
        is.close(); // 읽기 위해 열어둔 스트림 닫음.
    }
}
