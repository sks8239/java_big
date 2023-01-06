package 최소값최대값구하기;

import java.util.Scanner;

// 정수 값 입력
// 입력된 정수 범위의 임의의 값 입력해서 배열 생성
// 해당 배열에서 제일 작은 값과 제일 큰 값찾기
public class MinMaxArray {
    public static void main(String[] args) {
        System.out.print("정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int range1 = sc.nextInt();
        int number[] = new int[range1];
        int v = 0;
        int min = number[0];
        int max = number[0];
        for(int i = 0; i < range1; i++){
            v = (int)((Math.random()* range1) +1);
            number[i]= v;
                if(number[i]<min){
                    min = number[i];
                }
                if(number[i]>max){
                    max = number[i];
                }
            }
        System.out.print("최소값은 " + min);
        System.out.print(" 최대값은 " + max + "\n");
        for(int a = 0; a < range1; a++){
            System.out.print(number[a] + " ");
        }
    }
}
