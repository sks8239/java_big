package 아이패드만들기;

public class iPadProMain {
    public static void main(String[] args) throws InterruptedException {
        while(true){
            IPadProMake iPad = new IPadProMake("iPad Pro");
            if(iPad.continueOrder()) break;
            iPad.setScreen();
            iPad.setColor();
            iPad.setMemory();
            iPad.setNetwork();
            iPad.setName();
            iPad.setSerialNum();
            iPad.inProductPad();
            iPad.productPad();
        }
    }
}
