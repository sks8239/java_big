package 메소드연습;
// 메소드 호출 연습과 재귀 호출
public class Sample {
    public static void main(String[] args) {
        System.out.println(whileSum(10));
        System.out.println(forSum(10));
        System.out.println(gausSum(10));
        System.out.println(recuSum(10));
    }
    String name;
    Sample(){
        this.name = name;
    }
    // 클래스 메소드이다
    public static int whileSum(int n) {
        int sum = 0;
        while(true) {
            sum += n;
            n--;
            if(n == 0) break;
        }
        return sum;
    }
    String getName(){
        return name;
    }
    public static int forSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    int sum(int a, int b){ //메소드 호출 시 매개변수로 값을 전달
        return a + b; // 메소드 호출 결과를 정수값으로 반환
    }
    public static int gausSum(int n) {
        return n * (n + 1) / 2;
    }
    void say(){
        System.out.println(getName()+"안녕하세요 ^^");
    }
    String sayStr(){
        return "안녕하세요";
    }
    public static int recuSum(int n) {
        if(n == 0) return 0;
        return n + recuSum(n - 1);
    }
    //메소드의 매개변수는 일반적으로 개수가 정해져있음. 경우에 따라 개수를 모르는 경우 ...을 사용
    int sum(int...values){
        int sum=0;
        for(int i=0; i < values.length;i++){
            sum += values[i];
        }
        return sum;
    }
}