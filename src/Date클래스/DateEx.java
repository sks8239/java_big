package Date클래스;

import java.text.SimpleDateFormat;
import java.util.Date;

//Date() : 1970년 1월 1일 0시 0분 0초에서 현재까지의 경과시간으로 시간 계산(msec), 객체를 생성 후 사용
// SimpleDateFormat : 운영체제로부터 얻어진 시간 정ㅇ보를 우리가 원하는 포맷으로 변경해서 출력함(pattern 매칭을 사용)
public class DateEx {
    public static void main(String[] args) {
        Date date = new Date();
        // yyyy : 년도를 4자리로 표현
        // yy : 년도를 2자리로 표현
        // MM : 월을 표시, 반드시 대문자
        // dd : 일을 표시
        // HH : 24시간제를 의미
        // hh : 12시간제를 의미
        // mm : 분을 의미
        // ss : 초를 의미
        // w : 몇번째 주
        SimpleDateFormat f1, f2, f3, f4, f5, f6;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/M/d");
        f3 = new SimpleDateFormat("yyyy년 MM월 dd일");
        f4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        f5 = new SimpleDateFormat("HH:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 w번째 주, d번째 날 입니다.");

        System.out.println(f1.format(date));
        System.out.println(f2.format(date));
        System.out.println(f3.format(date));
        System.out.println(f4.format(date));
        System.out.println(f5.format(date));
        System.out.println(f6.format(date));
    }
}
