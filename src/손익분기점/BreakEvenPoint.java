package 손익분기점;

import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long computer = 0;
        if (b >= c) {
            System.out.print("-1");
        } else {
            while (true) {
                if (computer > a / (c - b)) {
                    System.out.print(computer);
                    break;
                }
                computer++;
            }
        }
    }
}