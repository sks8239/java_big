package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class problem1149 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minValue = 0;
        int select = 3;
        int out = 0;
        int[] color = new int[3]; // r g b 가격정하기
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < 3; i++) {
                color[i] = sc.nextInt();
            }
            switch (select) {
                case 0:
                    if (color[1] > color[2]) {
                        minValue = color[2];
                        out += minValue;
                        select = 2;
                    } else if (color[1] < color[2]) {
                        minValue = color[1];
                        out += minValue;
                        select = 1;
                    } else {
                        minValue = color[1];
                        out += minValue;
                        select = 3;
                    }
                    System.out.println(out);
                    break;
                case 1:
                    if (color[0] > color[2]) {
                        minValue = color[2];
                        out += minValue;
                        select = 2;
                    } else if (color[0] < color[2]) {
                        minValue = color[0];
                        out += minValue;
                        select = 0;
                    } else {
                        minValue = color[0];
                        out += minValue;
                        select = 3;
                    }
                    System.out.println(out);
                    break;
                case 2:
                    if (color[0] > color[1]) {
                        minValue = color[1];
                        out += minValue;
                        select = 1;
                    } else if (color[0] < color[1]) {
                        minValue = color[0];
                        out += minValue;
                        select = 0;
                    } else {
                        minValue = color[0];
                        out += minValue;
                        select = 3;
                    }
                    System.out.println(out);
                    break;
                case 3:
                    if (color[0] == color[1] || color[1] == color[2]) {
                        out += color[0];
                        select = 3;
                    } else {
                        IntStream integerStream = Arrays.stream(color);//가격 정한거 스트림에 넣고
                        minValue = integerStream.min().getAsInt();
                        out += minValue;
                        for (int x = 0; x < 3; x++) {
                            if (minValue == color[x]) {
                                select = x;
                            }
                        }
                    }
                    System.out.println(out);
            }
        }
        System.out.println(out);
    }
}