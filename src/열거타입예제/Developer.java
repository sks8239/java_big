package 열거타입예제;

public class Developer {
    private String name;
    private DevType type;
    private Career career;
    private Gender gender;

    public Developer(String name, DevType type, Career career, Gender gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }
    public void devInfO(){
        System.out.println("이름 : " + name);
        System.out.println("타입 : " + type);
        System.out.println("직업 : " + career);
        System.out.println("성별 : " + gender);
    }
}
