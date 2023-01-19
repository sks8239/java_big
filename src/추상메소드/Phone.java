package 추상메소드;
// 추상클래스 만들기
// 인스턴스 필드 포함, 생성자 포함
public abstract class Phone {
    String name;
    boolean isPower;
    Phone(String name){ //매개변수가 있는 생성자를 만듦
        this.name = name;
    }
    void setPower(boolean power){
        isPower = power;
        if(isPower){
            System.out.println("Phone Power ON");
        }else{
            System.out.println("Phone Power OFF");
        }
    }
    abstract void call();
    abstract void internet();
}
