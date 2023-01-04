package 나머지연산자문제;

import java.util.Scanner;

//
public class ModEx1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a,b,c;
        a = num / 100;
        b = (num % 100) / 10;
        c = num % 10;
    }
}
