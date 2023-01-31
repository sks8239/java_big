package HashMap기본;
// HashMap : 키와 값으로 구성되어 있음, 키의 중복 여부 확인은 hashCode()를 통해서 수행
// 키의 중복은 허용하지 않음, 값은 중복 가능, 순서를 유지하지 않음
// 경우에 따라 hashCode()와 equals() 메소드를 오버라이드해서 사용해야 함.
// HashMap 은 성능이 우수하고 멀티스레드 환경을 지원하지 않음(즉 동기화기능 없음)
// HashTable 은 HashMap 내부 구조가 동일하며 멀티스레드 지원
// Properties 는 HashTable 을 상속받아 기능을 제약하여 사용(키와 값이 모두 문자열로만 구성), 정보를 파일에 저장하거나 읽기 위한 용도


import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // 객체 추가 : put(키,값)
        map.put("Americano", 2500);
        map.put("Latte", 4500);

        // 객체 찾기 : get(키)
        // 키를 주면 반환값으로 값이 넘어옴.
        System.out.println(map.get("Latte"));

        // 객체 삭제 : remove(키)
        // 키를 넘겨 삭제가 정상적으로 진행되면 값을 반환
        System.out.println(map.remove("Latte"));
    }
}
