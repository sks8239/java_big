package Array클래스;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Arrays : 배열을 다루기 위한 다양한 메소드를 포함하고 있다.
// binarySearch() : 이분 검색 알고리즘 제공
// sort() : 기본적인 오름차순, 그리고 매개변수를 이용해 내림차순 , 그리고 오버라이딩을 통한 직접 구현
// toString() : 배열의 요소를 문자열로 출력
// asList() : 일반 배열을 ArrayList로 변환
public class ArraysTestEx    {
    public static void main(String[] args) {
        Integer[] arr = {5,3,4,1,2,345,777,657,235};
            Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                    return o2-o1;
            }
        });

//        Scanner sc = new Scanner(System.in);
//        System.out.println("배열의 갯수 : ");
//        int num = sc.nextInt();
//        int[] arr = new int[num];
//        System.out.println("찾을 수 입력 : ");
//        int key = sc.nextInt();
//        for(int i =0; i <arr.length; i++){
//            arr[i] = (int)(Math.random() * num) +1; // 배열의 개수 범위 내의 값으로 난수 발생
//        }
//        Arrays.sort(arr);
//        for(int e : arr) System.out.print(e + " ");
//        System.out.println();
//        int rst = Arrays.binarySearch(arr, key); //배열이름과 찾을 값을 매개변수로 전달함
//        //결과갑승로 해당값이 있는 배열의 인덱스가 반환, 찾는값이 없으면 음수가 반환됨
//        if(rst >= 0) System.out.println(rst);
//        else System.out.println("찾는 값이 없습니다.");
    }
}
