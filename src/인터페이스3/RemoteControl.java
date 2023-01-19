package 인터페이스3;
//인터페이스란?
//모든 필드는 자동으로 상수(final static)으로 변환됩니다.
//모든 메소드는 자동으로 추상메소드가 됩니다. public abstract가 자동추가
//디폴드 메소드 : 예외적으로 구현부를 가질 수 있으며 상속 받은 클래스에서 재정의 가능
//정적메소드를 포함할 수 있다.(정적메소드는 객체와 상관없이 인터페이스 타입으로 사용된다.)
public interface RemoteControl {
    int MAX_VOLUME = 100; // 자동으로 final static 이 붙는다.
    int MIN_VOLUME = 0;
    void turnON();        // 자동으로 abstract 가 붙는다.
    void turnOFF();
    void setVolume(int volume);
    // 디폴트 메소드 : jdk 1.8 이후에 추가 됨, default 키워드를 사용 함
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }
    static void changeBattery() {
        System.out.println("건전지를 교환 합니다.");
    }

}
