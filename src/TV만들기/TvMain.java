package TV만들기;

public class TvMain {
    public static void main(String[] args) {
        TV samsungTv = new TV(); //기본생성자
        TV lgTV = new TV(true, 59,15); //매개변수가 있는 생성자 호출
        lgTV.getTV();

        samsungTv.setON(true);
        samsungTv.setChannel(999);
        samsungTv.setVolume(30);
        samsungTv.getTV();
    }
}
