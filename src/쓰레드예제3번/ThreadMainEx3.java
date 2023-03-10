package 쓰레드3;

import 쓰레드예제3번.ThreadA;
import 쓰레드예제3번.ThreadB;

// yield() : 다른 쓰레드에게 실행을 양보하는 것
// 대기 상태로 가는것이 아니고 현재 수행 순서를 양보 함 (수행 대기열을 건너 뜀)
public class ThreadMainEx3 {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        threadA.work = false; // thread A 일 중지

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e ) {}
        threadA.work = true; // Thread A, Thread B 둘 다 동작

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) { }
        threadA.stop = true;
        threadB.stop = true;
    }
}