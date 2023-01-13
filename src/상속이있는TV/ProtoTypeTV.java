package 상속이있는TV;

public class ProtoTypeTV {
    boolean isPower; //전원에 대한 설정값 저장
    int channel; // 채널정보저장
    int volume; //볼륨 값 저장

    public ProtoTypeTV() {
        this.isPower = false;
        channel = 10;
        volume = 10;
    }
    //생성자 오버로딩 일어남
    public ProtoTypeTV(boolean isPower,int channel, int volume){
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }

    public void setChannel(int cnl) {
        if(cnl > 0 && cnl < 1000) {
            channel = cnl;
        } else {
            System.out.println("채널 설정 범위를 벗어 났습니다.");
        }
    }
}
class ProductTV extends ProtoTypeTV{
    String name;
    boolean isInternet;
    ProductTV(String name){
        super(true,30,30); // 부모의 생성자를 호출함
        this.name = name;
    }
    void setPower(boolean power) {
        this.isPower = power;
    }
    void setVolume(int vol) {
        if(vol >= 0 && vol <= 100) {
            volume = vol;
        } else {
            System.out.println("볼륨 설정 범위를 벗어 났습니다.");
        }
    }

    @Override
    public void setChannel(int cnl){
        if(cnl > 0 && cnl < 2000){
            channel=cnl;
        }else{
            System.out.println("채널 설정 범위를 벗어 났습니다.");
        }
    }
    public void setChannel(int cnl, boolean internet) {
        if(internet) {
            System.out.println("인터넷모드 입니다.");
            isInternet = true;
        } else {
            isInternet = false;
            if(cnl > 0 && cnl < 1000) {
                channel = cnl;
                System.out.println("채널을 " + channel + "로 변경 했습니다.");
            } else {
                System.out.println("채널 설정 범위가 아닙니다.");
            }
        }
    }
    public void viewTV() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷모드 : " + isInternet);
    }
}

