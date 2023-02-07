package 예외처리예제5번;
// finally : 프로그램 실행 도중 예외가 발생할 가능성이 있는 코드에 try 구문을 걸게 되는데
// 이 때 예외발생 시 catch 구문으로 진행하고 예외가 발생하지 않는다면 아래 코드가 실행된다.
// 이 경우에 예외 여부에 관계없이 반드시 항상 실행되어야 할 구문이 있다면 finally 로 처리

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionEx5 {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("D:\\Dev\\work_java\\Java_Big_Data_1230\\src\\예외처리예제5번\\test.txt");
            f.write("test file");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}