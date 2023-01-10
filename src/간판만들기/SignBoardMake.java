package 간판만들기;

import java.util.Scanner;

// 각 숫자마다 차지하는 공간이 다름
// 숫자 0은 4칸, 1은 2칸, 그 외 숫자는 3칸을 차지한다
// 각 숫자 사이에는 1칸의 여백이 필요
// 총 입력한 숫자를 표기하기 위해 몇칸의 공간이 필요한지
// 120 = 1+ 2 + 1+ 3 + 1 + 4 + 1 = 13
// 5611 = 1+3+1+3+1+2+1+2+1=
public class SignBoardMake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("숫자를 입력하세요 : ");
            String num = sc.next();
            int a = 0;
            int b = Integer.parseInt(num);
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '0')
                    a += 4;
                else if (num.charAt(i) == '1')
                    a += 2;
                else {
                    a += 3;
                }
            }
            System.out.print((num.length()+ a + 1 + "\n"));
            if(b ==0) break;
        }
    }
}
