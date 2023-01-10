package 클래스기본;

public class BasicClass {
    public static void main(String[] args) {

    }
}

//접근제한자가 default인 클래스 생성 (동일한 패키지 내에서 접근 가능)
class Car{
    static String manufacture; //클래스 변수 (넓은 의미에서 필드이다.)
    String name; // 인스턴스 필드 (클래스가 객체로 만들어 질 때 객체의 갯수만큼 생성됨)
    String color; //인스턴스 변수(필드)
    String productYear; //인스턴스 변수(필드)
    int maxSpeed; //인스턴스 변수(필드)
    //생성자 : 클래스 이름과 동일하고 반환 타입 없다. void조차 없다.
    //생성자는 주로 개체 생성 시 객체 내부의 필드를 초기화 하는 목적으로 사용된다.
    //필드는 생성자의 매개변수로 전달된다. (객체를 생성하는 곳에서)


    Car(String name, String color, String year, int speed){
        this.name = name;
        this.color = color;
        productYear = year;
        maxSpeed = speed;
    }
    // Setter 메소드 : 인스턴스의 값을 설정하는 메소드
    void setName(String name){
        this.name=name;
    }
    void setColor(String color){
        this.color=color;
    }
    void viewcar(){
        System.out.println("제조사 : " + manufacture);
        System.out.println("이름 : " + name);
    }
}
