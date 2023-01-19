package 두번째숫자찾기;

import java.util.Scanner;

public class SecondNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("임의의 수를 10개 입력하세요 : ");
        int[] Num = new int[10];
        int addr=0;
        for (int i = 0; i < 10; i++) {
            Num[i] = sc.nextInt();
        }
        System.out.print("찾을 수를 입력하세요 : ");
        int findNum = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (findNum == Num[i]) {
                addr++;
                if(addr==2) {
                    System.out.print(i+1);
                }
            }
        }if(addr==0 || addr==1){
            System.out.print(-1);
        }
    }
}
