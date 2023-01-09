package 상근날드;

import java.util.Scanner;

// 상근날드 가게에서는 세트 메뉴를 판매합니다.
// 햄버거는 3개 종류가 있고
// 음료는 2가지 종류가 있음
// 입력은 5개의 값을 연속으로 입력하는데 햄버거 3가지, 음료 2가지의 가격을 연속으로 입력
// 햄버거 3가지 중 가장 싼 메뉴 선택, 음료 2가지 중 싼 것 선택하고, 세트 메뉴이기 때문에 50원 할인
// 총 세트 메뉴의 금액을 구하라
public class SetMenu {
    public static void main(String[] args) {
        System.out.print("메뉴의 가격을 설정하세요 : ");
        int Menu[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            Menu[i] = a;
        }
        int bugger = Menu[0];
        int drink = Menu[3];
        for (int j = 0; j < 3; j++) {
            if (Menu[j] <= bugger)
                bugger = Menu[j];
        }
        for (int x = 3; x < 5; x++) {
            if (Menu[x] <= drink)
                drink = Menu[x];
        }
        System.out.print("고르신 메뉴의 가격은 " + ((bugger + drink) - 50) + " 원 입니다.");
    }
}