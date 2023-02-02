package 클래스정렬연습문제;
// 학생의 수를 입력받기
// 학생의 수만큼의 객체를 생성하여 정보 입력(이름 성적 학번)
// 학생의 성적이 높은 순으로 결과를 표시하고 성적이 같으면 학번순 정렬
// 그리고 출력 시 등수가 표기되도록 할 것
// 안유진 99 202301
// 정국 87 202302
// 채연 88 202303
import java.util.Scanner;
import java.util.TreeSet;

public class ClassSortEx1 {
    public static void main(String[] args) {
        TreeSet<StudentSort> ts = new TreeSet<>();
        System.out.print("학생 수 입력 : ");
        Scanner sc = new Scanner(System.in);
        int StudentNum = sc.nextInt();
        int a = 1;
        int preScore = 0;
        for (int i = 0; i < StudentNum; i++) {
            ts.add(new StudentSort(String.format("%7s",sc.next()), sc.nextInt(), sc.nextInt()));
        }
        System.out.println("==== 학생 성적 출력 ====");
        System.out.println("----------------------");
        System.out.println("석차   성적   이름   학번");
        for (StudentSort e : ts) {
            if(preScore != e.grade) {
                System.out.printf("%d %6d %s %-7d\n", a++, e.grade, e.name, e.num);
                preScore = e.grade;
            }else{
                a -= 1;
                System.out.printf("%d %6d %s %-7d\n", a, e.grade, e.name, e.num);
                preScore = e.grade;
                a +=2 ;
            }
        }
    }
}