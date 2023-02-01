package 클래스정렬연습문제;

public class StudentSort implements Comparable<StudentSort> {
    String name;
    int grade;
    Integer num;

    public StudentSort(String name, int grade, Integer num) {
        this.name = name;
        this.grade = grade;
        this.num = num;
    }

    @Override
    public int compareTo(StudentSort o) {
        if (this.grade == o.grade) {
            return this.num.compareTo(o.num);
        }
        return  o.grade - this.grade; // 양수라면 정렬(오름차순 정렬)
    }
}
