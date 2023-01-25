package 다운캐스팅;

import java.util.ArrayList;

// 다운캐스팅? 상위 클래스형으로 변환되었던 하위클래스를 다시 원래 자료형으로 변환하는 것
// instanceof : 형변환가능 여부를 확인하는 용도(참조변수가 참조하고 있는 객체의 실제 타입을 알아보기 위해 사용)
public class DownCasting {
    ArrayList<Animal> aniList = new ArrayList<>();
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
        System.out.println("원래 형으로 다운 캐스팅");
        downCasting.testCasting();
    }

    public void addAnimal() {
        aniList.add(new Animal()); // ArrayList에 추가되면서 Animal 형으로 변환
        aniList.add(new Tiger());
        aniList.add(new Eagle());

        for(Animal ani : aniList) {
            ani.move();
        }
    }

    public void testCasting() {
        for(int i = 0; i < aniList.size(); i++) {
            Animal ani = aniList.get(i);
            if(ani instanceof Human) {  // Human 형으로 다운캐스팅 가능한지 확인
                Human h = (Human) ani;
                h.readBook();
            } else if(ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if(ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            } else {
                System.out.println("지원되지 않는 형 입니다.");
            }
        }
    }
}