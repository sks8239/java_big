package 인터페이스활용;

public interface Buy {
    void buy();
    default void order(){
        System.out.println("구매 주문");
    }
}
