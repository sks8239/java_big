package 스트림예제5번;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(7,5,5,2,1,3,5,4,6);
        IntStream stream2 = IntStream.of(7,5,5,2,1,3,5,4,6);
        // 스트림에서 홀수만 골라냄
        stream2.filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " "));


        //스트림 변환(map()) : 해당 스트림의 요소들에 주어진 함수의 인수로 전달하여, 그 반환 값으로 이루어진 새로운 스트림 생성
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA","JAVASCRIPT");
        stream.map(e->e.length()).forEach(System.out::println);

        String[]arr = {"I study hard","You study JAVA", "I am hungry"};
        Stream<String> stream3 = Arrays.stream(arr);
        stream3.flatMap(s->Stream.of(s.split(" "))).forEach(System.out::println);

        //스트림제한
        // limit() : 해당 스트림의 첫번째 요소부터 전달된 개수만큼의 요소로만 이루어진 새로운 스트림반환
        // skip() : 해당 스트림의 첫번째 요소부터 전달 된 개수만큼의 요소를 제외하고 출력
        IntStream stream4 = IntStream.range(0, 10); // 0~10 미만까지 범위 지정
        IntStream stream5 = IntStream.range(0, 10);
        IntStream stream6 = IntStream.range(0, 10);
        stream4.limit(5).forEach(n->System.out.print(n + " ")); //처음부터 5까지
        System.out.println();
        stream5.skip(5).forEach(n->System.out.print(n + " "));
        System.out.println();
        stream6.skip(3).limit(5).forEach(n->System.out.print(n + " "));

        // 스트림 정렬 : 해당 스트림을 주어진 비교차(comparator)를 이용하여 정렬
        Stream<String>stream7 = Stream.of("HTML", "CSS", "JAVA","JAVASCRIPT");
        Stream<String>stream8 = Stream.of("HTML", "CSS", "JAVA","JAVASCRIPT");
        stream7.sorted().forEach(s -> System.out.print(s+" "));
        System.out.println();
        stream8.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
    }
}
