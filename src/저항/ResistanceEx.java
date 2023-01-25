package 저항;

import java.util.Scanner;

public class ResistanceEx {
    public static void main(String[] args) {
        System.out.println("색을 3개 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String firstColor = sc.next();
        String secondColor = sc.next();
        String thirdColor = sc.next();
        int num[] = new int[3];
        String Color[] = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        for (int i = 0; i < 10; i++) {
            if (firstColor.equalsIgnoreCase(Color[i])) num[0] = i;
            if (secondColor.equalsIgnoreCase(Color[i])) num[1] = i;
            if (thirdColor.equalsIgnoreCase(Color[i])) num[2] = i;
        }
        long number = (((num[0] * 10) + num[1]) * (long) Math.pow(10, num[2]));
        String out = String.valueOf(number);
        out = out.replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",");
        System.out.println(out);
    }
}