package 평균점수구하기;

import java.util.Scanner;

// 상현이가 가르치는 학생은 총 5명(안유진, 유나, 채원, 카즈하, 장원영)
// 기말고사를 치고 난 후 성적이 40점 미만인 경우 보충학습을 듣는 조건으로 40점으로 성적 조정
// 모든 학생이 보충학습을 들음
// 총 수강생의 평균을 구하는 프로그램 작성
public class ArrayExAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하세요 : ");
        int grade[] = new int[5];
        int sum = 0;
        for(int i = 0; i < grade.length; i++){
            int a = sc.nextInt();
            if(a < 40){
                a = 40;
            }
            if((a % 5 != 0) || (a>100) || (a<0)){
                System.out.print("성적을 잘못 입력하셨습니다.");
            }
            grade[i] = a;
        }
        for(int j = 0; j < 5; j++){
            sum += grade[j];
        }
        System.out.print(grade.length + "명의 평균은 " + sum / grade.length);
    }
}
