package 벡터예제;
// Vector는 ArrayList 내부적으로 동일한 구조입니다. 메소드의 사용방법도 완전히 동일합니다. 멀티스레드에 안전합니다.


import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("신경섭","010-1234-5678","sks8239@naver.com","developer","Korea"));
        list.add(new NameCard("우영우","010-1111-2222","y2y2y@naver.com","lawyer","Seoul"));
        list.add(new NameCard("동그라미","010-9999-8888","circle@naver.com","student","Incheon"));

        for(NameCard e : list){
            System.out.println("이름 : " + e.name);
            System.out.println("전화번호 : " + e.phone);
            System.out.println("메일 : " + e.mail);
            System.out.println("직업 : " + e.position);
            System.out.println("주소 : " + e.address);
        }
    }
}

class NameCard{
    String name;
    String phone;
    String mail;
    String position;
    String address;

    public NameCard(String name, String phone, String mail, String position, String address) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.position = position;
        this.address = address;
    }
}