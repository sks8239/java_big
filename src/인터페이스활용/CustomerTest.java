package 인터페이스활용;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer; // Customer Type의 customer 참조변수를 Buy 인터페이스형 buyer 참조 변수에 대입(형 변환)
        buyer.buy(); // buyer은 Buy 인터페이스의 메소드만 호출 가능
        buyer.order();

        Sell sell = customer; // 자동 형변환이 일어남
        sell.sell();
        sell.order();

        Customer customer1 = (Customer) sell; //다시 역으로 형 변환
        customer1.buy();
        customer1.sell();


    }
}
