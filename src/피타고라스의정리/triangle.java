package 피타고라스의정리;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = -1, b = -1, c = -1;
        ArrayList<String> out = new ArrayList<>();
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a == 0 && b == 0 && c == 0) {
                break;
            }
            if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                out.add("right");
            } else{
                out.add("wrong");
            }
        }
        for(String e : out) System.out.println(e);
    }
}
