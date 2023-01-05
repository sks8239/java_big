package 반복문연습문제2번;

import java.util.Scanner;

//입력 : 5
// *
// * *
// * * *
// * * * *
// * * * * *
public class StarPrintEx {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("별을 몇 줄 찍을까요 : ");
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
