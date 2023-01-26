package Math클래스;

import java.util.ArrayList;
import java.util.List;

// Math 클래스의 모든 메소드는 클래스 메소드이므로 객체를 생성하지 않고 바로 사용함.
// random() : 0.0~1.0 미만의 임의의 double 형 값을 생성해서 반환
// abs() 메소드 : 절대값 구하기 ,양수면 양수, 음수면 음수
// floor() : 소수점 이하를 무조건 날림
// ceil() : 소수점 이하가 있으면 무조건 올림
// round() : 반올림
// 7자리의 로또 번호 생성하기
// 7개의 배열을 만들고 첫번째 부터 여섯번째는 0~ 50사이의 임의의 수 생성 후 대입
// 마지막 7번째는 50~100사이의 임의의 수를 만들어서 대입하고 한번에 출력 단 중복은 허용
public class MathMainEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int num;
        while (true) {
            num = (int) (Math.random() * 51);
            list.add(num);
            if (list.size() == 6)
                break;
        }
        list.add((int)(((Math.random() * 51) + 50)));
        System.out.println(list);
    }
}
