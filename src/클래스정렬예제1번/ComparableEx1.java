package 클래스정렬예제1번;
// Comparable 은 클래스를 정렬을 구현 할 수 있도록 해주는 인터페이스이며 TreeSet 컬렉션에서 사용해야 함
// compareTo() 메소드를 오버라이딩해서 정렬 조건을 구현해야 함
// 정렬 조건은 자신의 객체와 매개변수로 입력받은 객체를 비교
// 정렬 조건은 양의 정수 값을 반환하면 정렬 조건이 됨
// 정렬 조건을 0으로 반환하면 Set의 특성으로 인해 해당 객체가 표시되지 않음

import java.util.TreeSet;

public class ComparableEx1 {
    public static void main(String[] args) {
        TreeSet<CarSort> ts = new TreeSet<>();
        ts.add(new CarSort("싼타페",2016,"흰색"));
        ts.add(new CarSort("쏘렌토",2012,"은색"));
        ts.add(new CarSort("그랜저",2022,"검정"));
        ts.add(new CarSort("G80",2022,"은색"));

        for(CarSort e : ts){
            System.out.println("차종 : " + e.modelName + "\n연식 : " + e.modelYear + "\n");
        }
    }
}
