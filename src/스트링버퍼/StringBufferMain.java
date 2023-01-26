package 스트링버퍼;
// StringBuffer : 객체 생성 후 사용, 문자열 추가 시. 기존의 문자열이 수정됨,동기화지원(멀티쓰레드에서 안전)
// StringBuilder : 객체 생성 후 사용, 문자열 추가 시 기존 문자열이 수정됨 동기화 지원 안됨, 성능은 우수
// String : 객체 생성 필요없음, 문자열 추가 시 새로운 문자열이 만들어짐, 문자열 추가가 길어지면 성능저하
// append() : 문자열을 추가
// StringBuilder 성능이 우수하지만 싱글 쓰레드용
// StringBuffer 멀티 쓰레드용
// delete(시작인덱스, 끝인덱스) : 전달된 인덱스의 문자열을 제거
// insert(인덱스, "추가할 문자열") : 문자열 삽입
// substring(시작인덱스, 끝인덱스) : 문자열 자르기
public class StringBufferMain {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("Java");
        sb.append("^^");
        sb.delete(0, 5); // 시작 인덱스에서 끝 인덱스 미만까지 삭제
        sb.insert(0, "Hi^^ ");
        System.out.println(sb);
        System.out.println(sb.substring(0, 8)); // 문자열 자르기
    }
}