package 조건문연습문제1;

import java.util.Scanner;

public class ScoreGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하세요 : ");
        int grade = sc.nextInt();
        if((grade >=0)&&(grade <=100)){
            if(grade >= 90){
                System.out.println("A등급입니다.");
            } else if(grade >= 80){
                System.out.println("B등급입니다.");
            } else if(grade >= 70){
                System.out.println("C등급입니다.");
            } else if(grade >= 60) {
                System.out.println("D등급입니다.");
            } else {
                System.out.println("F등급입니다.");
            }
        }else{
            System.out.println("성적을 잘못입력하셨습니다.");
        }
    }
}
