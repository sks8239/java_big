package 평균은넘겠지;

import java.util.Scanner;

public class AboveAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("테스트 케이스의 갯수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;
        double total =0;
        for(int i=0; i< num; i++) {
            System.out.println("학생 수를 입력하세요 : ");
            int num2 = sc.nextInt();
            int a [] = new int[num2];
            System.out.println("점수를 입력하세요 : ");
            for(int j=0; j < a.length; j++) {
                int grade = sc.nextInt();
                a[j] = grade;
                sum += a[j];
            }
            for(int q=0; q < a.length; q++) {
                if((sum/a.length)<a[q]){
                    total += 1;
                }
            }
            System.out.printf("%.3f%%\n" ,(total/a.length)*100);
        }
    }
}
