package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem1016 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long min = Long.valueOf(st.nextToken());
        long max = Long.valueOf(st.nextToken());

        int result = (int) (max - min + 1); //숫자범위
        int sqrt = ((int) Math.sqrt(max));

        // 제곱수인지 확인. false = 제곱수가 아님, true = 제곱수
        boolean[] checks = new boolean[result];
        long[   ] num = new long[result];


        for(long i = 2; i <= sqrt; i++) {
            long squared = i * i;
            long start = min % squared == 0 ? min / squared : (min / squared) + 1;
            for(long j = start; j * squared <= max; j ++) {	// 몫을 1씩 증가시킴( j가 몫 )
                checks[(int) ( (j * squared) - min)] = true;
            }
        }
        //제곱이 아닌 수
        int count = 0;
        for(int i = 0; i < result; i++) {
            if(!checks[i])
                count++;
        }

        System.out.println(count);
    }
}