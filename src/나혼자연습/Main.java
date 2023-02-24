package 나혼자연습;

import java.util.*;

public class Main {
    static int[][] arr;
    static int[][] dp;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        dp = new int[1001][3];

        getMin(1);

        int min = Math.min(dp[n][0], dp[n][1]);
        min = Math.min(min, dp[n][2]);

        System.out.println(min);
    }

    static void getMin(int level) {
        if (n + 1 == level) {
            return;
        }

        dp[level][0] = Math.min(dp[level - 1][1], dp[level - 1][2]) + arr[level - 1][0];
        dp[level][1] = Math.min(dp[level - 1][0], dp[level - 1][2]) + arr[level - 1][1];
        dp[level][2] = Math.min(dp[level - 1][0], dp[level - 1][1]) + arr[level - 1][2];

        getMin(level + 1);
    }
}
// 39 - 32 - 63 - 29 - 11 - 13 - 47 - 19