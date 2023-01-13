package 상속기본;
public class Animal {
    protected String name; // 접근 제한자 private 은 같은 클래스 내에서만 접근 가능
    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + "가 잠을 잡니다.");
    }
}
class HouseDog extends Dog {
    @Override
    void sleep() {
        System.out.println(this.name + "가 집에서 잠을 잡니다.");
    }
    //오버로딩 관계가 성립함.
    void sleep(int time){
        System.out.println(name + "이 " +  time + "시간 동안" + "집에서 잠을 잡니다.");
    }
}