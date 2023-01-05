package 중첩반복문;

import java.util.Scanner;

public class DoubleFor {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            System.out.printf("++[%d]단==\n", i);
            for(int j = 0; j < 10; j++){
                System.out.printf("%d * %d = %d", i, j, (i*j));
            }
            System.out.println("");
        }
    }
}
