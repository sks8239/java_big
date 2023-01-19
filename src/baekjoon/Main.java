package baekjoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int maxSum = 0;
        int minSum = 0;
        for (int i = 1; i <= min; i++) {
            if (i > 10) {
                if (((Math.log10(i) / Math.log10(2)) )% 1 != 0 || ((Math.log10(i) / Math.log10(3))) % 1 != 0 || ((Math.log10(i) / Math.log10(5))) % 1 != 0 || ((Math.log10(i) / Math.log10(6))) % 1 != 0|| ((Math.log10(i) / Math.log10(7))) % 1 != 0 || ((Math.log10(i) / Math.log10(10))) % 1 != 0) {
                }else {
                    minSum++;
                }
            } else if(i <=10){ // 1 , 2, 3, 5, 6, 7, 10
                if (1<=i && i<=3 || i>=5 && i<=7 || i == 10) {
                    minSum++;
                }
            }
        }
        for (int i = 1; i <= max; i++) {
            if (i > 10) {
                if (((Math.log10(i) / Math.log10(2)) )% 1 != 0 || ((Math.log10(i) / Math.log10(3))) % 1 != 0 || ((Math.log10(i) / Math.log10(5))) % 1 != 0 || ((Math.log10(i) / Math.log10(6))) % 1 != 0 || ((Math.log10(i) / Math.log10(7))) % 1 != 0 || ((Math.log10(i) / Math.log10(10))) % 1 != 0) {
                    maxSum++;
                }
            } else if(i <=10){
                if (1<=i && i<=3 || i>=5 && i<=7 || i == 10) {
                    maxSum++;
                }
            }
        }
        System.out.println(maxSum);
        System.out.println(minSum);
        System.out.println(maxSum - minSum + 1);
    }
}