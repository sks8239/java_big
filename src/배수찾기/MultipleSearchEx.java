package 배수찾기;
// 정수 n과 수의 목록이 주어졌을 때, 목록에 들어있는 수가 n의 배수인지 아닌지 구하는 프로그램 작성
// 입력 : 첫째 줄에 n이 주어짐, 다음 줄에 한줄 한 개씩 목록에 들어있는 수가 주어짐 (0~10000)
// 출력 : 목록에 있는 수가 n의 배수인지 아닌지를 구한 후 아래처럼 출력

// 입력예시
// 3 - 주어진 수
// 1
// 7
// 99
// 321
// 777
// 0 -> 반복문에 대한 종료

// 출력예시
// 1 is NOT a multiple of 3.
// 7 is NOT a multiple of 3.
// 99 is NOT a multiple of 3.
// 321 is NOT a multiple of 3.
// 777 is NOT a multiple of 3.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MultipleSearchEx {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        System.out.print("주어진 수 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            numbers.add(n);
        }
        for(int i =0; i<numbers.size(); i++){
            if(numbers.get(i) % a == 0){
                System.out.printf("%d is a multiple of %d.\n",numbers.get(i), a);
            }else{
                System.out.printf("%d is NOT a multiple of %d.\n",numbers.get(i), a);
            }
        }
    }
}
