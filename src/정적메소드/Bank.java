package 정적메소드;

public class Bank {
    private static int count = 0; // 클래스 필드
    private int account; // 계좌
    private String bank; //은행의 이름
    Bank(String name, int account) { //생성자는 클래스가 객체로 만들어질 때 호출됨
        count++;
        this.bank = name;
        this.account = account;
        System.out.println(name + "은행에 계좌를" +
                Util.getCurrentDate("yyyy/MM/dd") + "개설 합니다.");
        System.out.println("잔액은 " + account + " 입니다.");
    }
    public static int getCount() { //정적 필드값을 읽기 위한 정적 메소드(클래스 소속)
        return count;
    }
    //예금을 위한 메소드 작성
    public void setDeposit(final int dep) {
        this.account += dep;
        System.out.println(dep + "원을 예금 했습니다.");
    }
    public void setWithdraw(int with) {
        if(with > account) {
            System.out.println("잔액이 부족 합니다.");
        } else {
            account -= with;
        }
    }
    public  void viewAccount() {
        System.out.println(bank + " 현재 잔액은 " + account + "원 입니다.");
    }
}