package 콘솔입출력;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 콘솔입출력 : 키보드로 입력받고 화면에 출력하는 것
// System.in : 표준 입력 스트림
// System.out : 표준 출력 스트림
// System.err : 표준 오류 스트림 (System.out 과 거의 동일하며 버퍼 사용 방법만 다르다. 더 좋은 게 있어서 사용하지 않는다)
public class ConsoleEx {
    public static void main(String[] args) throws IOException {
//        System.out.println("=== 메뉴 ===");
//        System.out.println("1. 예금 조회");
//        System.out.println("2. 예금 출금");
//        System.out.println("3. 예금 입금");
//        System.out.println("4. 종료하기");
//        System.out.println("메뉴를 선택하세요 : ");
//        InputStream is = System.in;
//        char inputchar = (char) is.read(); //ASCII 코드를 읽어 문자로 변환
//        switch(inputchar){
//            case '1' :
//                System.out.println("예금조회");
//                break;
//            case '2' :
//                System.out.println("예금출금");
//                break;
//            case '3' :
//                System.out.println("예금입금");
//                break;
//            case '4' :
//                System.out.println("종료");
//                break;
//        }
        OutputStream os = System.out;
        for(byte b = 97; b < 97+26; b++){
            os.write(b);
        }
        os.write(10);
    }
}
