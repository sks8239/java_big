package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // public final static 숨겨져 있음
    int MIN_TEMP = 0;
    void airConON();  // 상속 받은 클래스에서 기능을 완성해야 함
    void airConOFF();
    void setAirConTemp(int tmp);
}
