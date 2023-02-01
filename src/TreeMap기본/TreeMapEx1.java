package TreeMap기본;

// TreeMap 도 Treeset 과 마찬가지로 이진검색트리(값이 추가될 때 정렬이 됨)로 구현되어있음
// Key 값으로 정렬하므로 key 값에 해당하는 Comparable 과 Comparator 을 구현해야 함

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> score = new TreeMap<>();
        score.put(87, "나희도"); // 25다섯 21
        score.put(88, "고유림"); // 25다섯 21
        score.put(75, "백이진"); // 25다섯 21
        score.put(65, "구자경"); // 25다섯 21
        score.put(98, "우영우"); // 해방일지, 손석구

        Map.Entry<Integer, String> entry = null;
        entry = score.firstEntry();
        System.out.println("가장 낮은 점수 : " + entry.getKey() + "점 " + entry.getValue());
        entry = score.lastEntry();
        System.out.println("가장 높은 점수 : " + entry.getKey() + "점 " + entry.getValue());
        entry = score.lowerEntry(95);
        System.out.println("95점 아래 점수 : " + entry.getKey() + "점 " + entry.getValue());
        entry = score.higherEntry(95);
        System.out.println("95점 위의 점수 : " + entry.getKey() + "점 " + entry.getValue());
    }
}
