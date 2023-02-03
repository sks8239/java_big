package 쓰레드예제2번;

public class CustomThread extends Thread{
    @Override
    public void run(){ // 쓰레드 실행부
        int sum = 0;
        for(int i=0; i <10; i++){
            sum += i;
            System.out.println("클래스 상속 스레드 :  " + sum);
        }
        System.out.println(Thread.currentThread() + "합계" + sum);
    }
}
