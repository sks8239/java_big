package 상속이있는TV;
//상속관계가 있는 코드
public class InheritanceTV {
    public static void main(String[] args) {
        ProductTV lgTV = new ProductTV("우리집 ");
        lgTV.setPower(true);
        lgTV.setVolume(120);
        lgTV.setChannel(1900, true);
        lgTV.viewTV();
    }
}
