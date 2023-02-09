package 입출력스트림에제4번;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class InOutStreamEx4 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test.txt");
        int readNo;
        int readData;
        char[] cBuf = new char[256];
        String data = "";
        while(true){
//            readData = reader.read(); //한개의 문자(2바이트)를 읽어 4byte int 타입으로 변경
//            if(readData==-1) break;
//            System.out.print((char)readData);
            readNo = reader.read(cBuf);
            if(readNo==-1) break;
            data += new String(cBuf,0,readNo);
        }
        reader.close();
    }
}
