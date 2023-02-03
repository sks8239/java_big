package 쓰레드예제3번;

public class ThreadB extends Thread {
    public boolean stop = false;
    boolean work = true;

    public void run() {
        while(!stop) {
            if(work) {
                System.out.println("ThreadB가 작업 중 입니다.");
            } else {
                Thread.yield();
            }
        }
    }
}