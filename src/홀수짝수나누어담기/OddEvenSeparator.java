package 홀수짝수나누어담기;

import java.util.Scanner;

public class OddEvenSeparator {
    int[] inputArr = new int[7];
    int[] oddArr = new int[7];
    int[] evenArr = new int[7];
    int[] zero = new int[7];
    //7개의 정수를 입력 받음
    void inputArray() {
        System.out.print("정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            inputArr[i] = sc.nextInt();
        }
    }
    //홀수 짝수 나누어 담기
    void separatorArray() {
        for (int i = 0; i < 7; i++) {
            if (inputArr[i] == 0) {
                zero[i] = 1;
            } else if (inputArr[i] % 2 == 1) {
                oddArr[i] = inputArr[i];
            } else if (inputArr[i] % 2 == 0) {
                evenArr[i] = inputArr[i];
            }
        }
    }
    //홀수 짝수 배열 출력
    void printArray() {
        System.out.print("홀수 : ");
        for (int i = 0; i < 7; i++) {
            if(oddArr[i]!=0)
            System.out.print(oddArr[i] + " ");
        }
        System.out.print("짝수 : ");
        for (int i = 0; i < 7; i++) {
            if(evenArr[i]!=0)
            System.out.print(evenArr[i] + " ");
        }
        System.out.print(" 제로 : ");
        for (int i = 0; i < 7; i++) {
            if(zero[i]==1)
                System.out.print(zero[i]-1 + " ");
        }
    }
}
