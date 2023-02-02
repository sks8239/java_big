package 쓰레드예제1번;
// multi-thread 란? 하나의 프로그램에서 여러가지 일을 동시에 수행하는 것


public class ThreadEx1 {
    public static void main(String[] args) {
        Thread test = new testThread();
        test.start();
        int sum = 0;

        for(int i = 0; i <= 100; i++){
            sum+=i;
            System.out.println("여기는 메인 스레드 입니다 : " +sum);
        }
        System.out.println(Thread.currentThread()+"합계 : "+sum);
    }
}


//thread 를 만드는 방법은 Thread Class 를 상속받는 방법이 있음(별로 좋지 않은 방법)
class testThread extends Thread{
    @Override
    public void run(){
        int sum=0;
        for(int i=0; i<=100; i++){
            sum += i;
            System.out.println("여기는 테스트 스레드 입니다 : " + sum);
        }
        System.out.println(Thread.currentThread()+"합계 : "+sum);
    }
}