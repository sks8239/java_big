package 회원정보종합예제;

import java.util.Scanner;

// 이름, 성별, 나이, 직업
public class MemberInfo { // 클래스 : 필드와 메소드로 구성
    // 필드 추가하기 : 필드란? 클래스 내부에서 사용하는 변수를 의미
    // (객체 생성 시 객체 갯수만큼 생성됨)
    String name;
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);

    public void setName() {
        System.out.print("이름을 입력하세요 ");
        name=sc.next();
    }
    public void setAge(){
        System.out.print("나이를 입력하세요 ");
        age = sc.nextInt();
    }

    public void setGender() {
        while(true){
            System.out.print("성별을 입력하세요 : ");
            gender= sc.next().charAt(0);
            switch(gender){
                case 'M':
                case 'm':
                case 'F':
                case 'f':
                    return;
                default:
                    System.out.println("성별을 잘못 입력하셨습니다.");
            }
        }
    }
    public void setJobs(){
        while(true){
            System.out.print("직업을 입력 하세요 : ");
            jobs = sc.nextInt();
            if(jobs > 0 && jobs < 5)
                return;
            System.out.println("직업을 잘못입력하셨습니다.");
        }
    }
    public int getGenderType(){
        if (gender =='M'|| gender =='m')
            return 1;
        else
            return 2;
    }
    public void viewInfo(){
        String[] genderStr = {"", "남성", "여성"};
        String[] jobsStr = {"", "학생", "회사원","주부","무직"};
        System.out.println("====== 회원 정보 출력 ======");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + jobsStr[jobs]);
    }
}
