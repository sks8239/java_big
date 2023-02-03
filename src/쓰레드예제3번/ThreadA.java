package 쓰레드예제3번;

public class ThreadA extends Thread {
    public boolean stop = false; // 종료 플래그
    public boolean work = true; // 작업 진행 여부에 대한 플래그

    public void run() {
        while(!stop) {
            if(work) {
                System.out.println("ThreadA가 작업 중 입니다.");
            } else {
                Thread.yield();
            }
        }
    }

}