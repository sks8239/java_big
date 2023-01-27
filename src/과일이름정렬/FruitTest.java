package 과일이름정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FruitTest {
    public static void main(String[] args) {
        String[] fruit = {"apple", "banana", "orange", "persimmon", "pear", "grapes", "mango", "watermelon", "peach", "strawberry"};
//        Arrays.sort(fruit, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                    if (o1.length() > o2.length()) {
//                        return 1;
//                    }
//                    else if(o1.length() == o2.length()){
//                        return o1.compareTo(o2);
//                }
//                return -1; // 현 상태 유지
//            }
//        });
        Arrays.sort(fruit, (o1, o2) -> o1.length() > o2.length() ? 1 : -1);
        System.out.print(Arrays.toString(fruit));
    }
}
//[pear, apple, mango, peach, banana, grapes, orange, persimmon, strawberry, watermelon]