package 상속실습연습;
// 인간(Person)이라는 클래스 생성
// -age : 나이 특성을 가짐(정수값 사용, 게터/세터) - 몇살?
// -sleep: 잠자는 특성 (정수 값 사용, 게터/세터) = 몇시간 잠자는지?
// 인간으로 부터 직장인을 생성
// -work : 몇 시간 일하는지? (정수, 게터 / 세터)
// 인간으로부터 학생을 생성
// -study : 공부하는 특성 (1 입력 "열심히", 2 "적당히", 3 "놀면서
public class InheritanceEx1 {
    public static void main(String[] args) {
        System.out.print("몇 살 이십니까? ");
        Person person = new Person();
        person.viewPerson();

        System.out.print("몇 시간 주무십니까? ");
        person.viewPerson2();

        System.out.print("몇 시간 일하십니까? ");
        OfficeWorker labor = new OfficeWorker();
        labor.viewOfficeWorker();

        System.out.println("얼마나 열심히 공부하십니까? [1]열심히 [2]적당히 [3]놀면서");
        Student study = new Student();
        study.viewStudent();
    }
}
