package 상속실습연습;
// 인간(Person)이라는 클래스 생성
// -age : 나이 특성을 가짐(정수값 사용, 게터/세터) - 몇살?
// -sleep: 잠자는 특성 (정수 값 사용, 게터/세터) = 몇시간 잠자는지?
// 인간으로 부터 직장인을 생성
// -work : 몇 시간 일하는지? (정수, 게터 / 세터)
// 인간으로부터 학생을 생성
// -study : 공부하는 특성 (1 입력 "열심히", 2 "적당히", 3 "놀면서

import java.util.Scanner;

public class Person {

    String ages = "살 입니다.";
    String sleeps = "시간 잡니다.";
    Scanner sc = new Scanner(System.in);

    String getAge() {
        return ages;
    }
    String getSleep(){
        return sleeps;
    }
    void viewPerson(){
        int age = sc.nextInt();
        System.out.println(age + ages);
    }

    void viewPerson2() {
        int sleep = sc.nextInt();
        System.out.println(sleep + sleeps);
    }
}

class OfficeWorker extends  Person{
    String works = "일 합니다.";

    String getWork(){
        return works;
    }
    Scanner sc = new Scanner(System.in);

    void viewOfficeWorker(){
        int work = sc.nextInt();
        System.out.println(work + "시간 " + works);
    }
}
class Student extends  Person{
    String study = "공부합니다.";
    Scanner sc = new Scanner(System.in);
    String hard = sc.next();
    String a[] = {"열심히", "적당히", "놀면서"};
    String getStudy(){
        return study;
    }
    void viewStudent(){
        if (hard.equalsIgnoreCase("1")){
            System.out.println(a[0] + " " + study);
        }else if(hard.equalsIgnoreCase("2")){
            System.out.println(a[1] + " " + study);
        }else if(hard.equalsIgnoreCase("3")) {
            System.out.println(a[2] + " " + study);
        }else{
            System.out.println(hard + " " + study);
        }
    }
}
