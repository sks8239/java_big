package 평균은넘겠지;

import java.util.Scanner;

public class AboveAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt();
        double[] rst = new double[testCnt];
        for (int i = 0; i < rst.length; i++) {
            rst[i]=overRate();
        }
        for (double e : rst) {
            System.out.printf("%.3f%%\n", e);
        }
    }

    static double overRate() {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int total = 0;
        int overCnt = 0;
        int[] score = new int[cnt];
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            total += score[i];
        }
        double aver = (double) total / cnt;
        for (int e : score) {
            if (e > aver)
                overCnt++;
        }
        return (double)overCnt/cnt * 100;
    }
}
