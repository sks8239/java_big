package 첫째줄8진수문제;

import java.util.Scanner;

public class FirstOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octalNumber = sc.next();
        char octal[] = new char[octalNumber.length()];
        int out[] = new int[octal.length+3];
        for (int i = 0; i < octalNumber.length(); i++) {
            octal[i] = octalNumber.charAt(i);
            System.out.println((int)(octal[i])/2);
            while (Integer.valueOf(octal[i])/ 2 == 1) {
                if (((int)octal[i] % 2 == 1)) {
                    out[i] = 1;
                } else {
                    out[i] = 0;
                }
                if (((Integer.valueOf(octal[i]) / 4) == 1)) {
                    out[i + 1] = 0;
                    out[i + 2] = 1;
                } else {
                    out[i + 1] = 0;
                }
                if (((Integer.valueOf(octal[i]) / 8) == 1)) {
                    out[i + 2] = 0;
                    out[i + 3] = 1;
                }
            }
        }
//        for(int i = out.length; i == 0; i--) {
//            System.out.print(out[i]);
//        }
    }
}
