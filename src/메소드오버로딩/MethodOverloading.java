package 메소드오버로딩;
// 메소드오버로딩? 동일한 이름의 메소드를 매개변수의 타입이나 갯수, 순서에 따라 다르게 호출하는 것
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(100,200,300));
        System.out.println(sum("a","b","c"));
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }
    static double sum(double x, double y, double z) {
        return x + y + z;
    }
    static String sum(String x, String y, String z) {
        return x + y + z;
    }
    static int sum(int x, String y, int z) {
        if(y.equals("100")) {
            return x + 100 + z;
        } else return 0;
}
}
