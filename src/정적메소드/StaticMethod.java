package 정적메소드;
 import static 정적메소드.Util.DomainName;

public class StaticMethod{
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinHan = new Bank("신한", 1000);
        Bank nh = new Bank("농협", 500);
        System.out.println("은행이 " + Bank.getCount() + "생성되었습니다");
        kakao.setDeposit(3000);
        kakao.setWithdraw(2000);
        kakao.viewAccount();

        System.out.println(Bank.getCount()); //getCount() 메소드는 정적메소드이며 , 클래스 소속

        System.out.println("현재 시간을 출력합니다.");
        System.out.println(Util.getCurrentDate("yyyy년MM월dd일-hh:mm:ss"));
        System.out.println("도메인 주소 : " + DomainName);
    }
}