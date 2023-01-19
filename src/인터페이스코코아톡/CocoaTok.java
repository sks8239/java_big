package 인터페이스코코아톡;

public class CocoaTok {
    private String to;
    private String msg;
    public CocoaTok(String name){
        to = name;
    }
    public void writeMsg(String msg){
        this.msg = to + " : " + msg;
    }
    public void send(NetAdapter na){
        na.send(msg);
    }
}
