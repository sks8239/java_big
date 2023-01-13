package 오버라이딩제약;

public class Vehicle {
    int speed;
    String color;
    String name;
    // final은 최종 상태를 의미하며, 메소드에서 사용 시 오버로딩이 불가함을 의미합니다.
    void accelerator(){
        System.out.println("차의 속도를 증가시킵니다.");
    }
    void breakPannel(){
        System.out.println("차의 속도를 감소시킵니다.");
    }
}
class SportsCar extends Vehicle{
    boolean isTurbo;
    SportsCar(String name){
        isTurbo =  false; //터보모드가 켜지면 차의 최고 속도를 증가 시키는 기능 , 상속받은 기능이 아님
        speed = 280; // Vehicle로 부터 상속받음
        this.name = name; // 생성자로부터 이름을 입력 받아 인스턴스 필드의 초기값으로 사용
        color = "Red";
    }
    int getSpeed(){ // 게터라고 부른다
        if(isTurbo) return speed *= 1.2;
        return speed;
    }
    boolean getTurbo(){ //게터
        return isTurbo;
    }
    void setTurbo(boolean x){
        isTurbo = x;
    }
    void infoCar(){
        System.out.println("이름 :" + name);
        System.out.println("속도 :" + getSpeed());
        System.out.println("색상 :" + color);
        System.out.println("터보모드 :" + isTurbo);
    }
}