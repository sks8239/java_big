package 제네릭일반;

import java.util.ArrayList;
import java.util.List;

public class GenericTestEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // List에서 사용할 데이터 타입 선언
        list.add("hello");
        String str = list.get(0); // 0번째 값 읽어옴
        System.out.println(str);
    }
}
