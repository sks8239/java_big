package 블랙잭;

import java.util.*;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[cnt];
        int sum=0;
        int rst =0;
        for(int i=0; i<arr.length; i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0; i < cnt; i++){
            for(int j=i+1; j < cnt ; j++){
                for(int k= j+1; k <cnt; k++){
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum <= m && rst < sum) rst = sum;
                }
            }
        }
        System.out.println("결과 : " + rst);
    }
}