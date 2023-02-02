package baekjoon;

import java.util.Scanner;
public class problem1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        long out[] = new long[testCase];
        for (int i = 0; i < testCase; i++) {
            int west = sc.nextInt();
            int east = sc.nextInt();
            long n = 1;
            for (int j = east-west+1; j <= east; j++) {
                n *= j;
            }
            long m = 1;
            for (int x = 1; x<=west; x++){
                m *= x;
            }
            out[i] = n/m;
        }
        for(long e: out) {
            System.out.println(e);
        }
    }
}