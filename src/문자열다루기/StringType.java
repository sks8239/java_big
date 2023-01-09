package 문자열다루기;

public class StringType {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase("HELLO"));  //ignorecase는 대소문자 구분하지 말고 비교하라는 의미
        System.out.println(a==c); //문자열의 내용비교가 아닌 참조, 즉 주소를 비교하라는 뜻
        String d = "Hello Java";
        //indexOf : 문자열에 특정 문자 혹은 문자열이 시작되는 인덱스를 리턴
        System.out.println(d.indexOf("Java"));
        //System.out.println(d.indexOf("J"));
        //contains : 문자열에서 특정 문자열의 포함여부를 리턴
        System.out.println(d.contains("Hello")); //대소문자구분
        //charAt : 문자열에서 특정 위치의 문자를 리턴함
        System.out.println(d.charAt(1));
        //replaceAll : 문자열 중 특정 문자열을 다른 문자열로 대체할 때 사용
        String language = "java, Python, C, C++, JavaScript, Kotlin, Swift";
        System.out.println(a.replaceAll("JavaScript", ""));
        String e = "Hello Java";
        System.out.println(e.substring(6)); // 시작인덱스부터 끝까지 추출
        System.out.println(e.substring(1,4)); //시작인덱스부터 종료인덱스 미만까지 추출
        // toUpperCase // toLowerCase : 문자를 모두 대문자 혹은 소문자로 변경
        System.out.println(e.toUpperCase());
        System.out.println(e.toLowerCase());
        // trim : 문자열의 앞 뒤에 있는 공백 제거
        String str  = "  자바 프로그래밍     !!!!!    ";
        System.out.println(str.trim());
        //문자열 포매팅이란? 문자열에 특정 문자를 삽입하는 방법 (삽입을 위해 서식이 필요)
        System.out.printf("자바 프로그랭믈 %s 합시다\n","열심히");

    }
}
