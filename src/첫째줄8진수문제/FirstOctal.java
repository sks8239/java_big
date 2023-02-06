package 첫째줄8진수문제;

import java.util.Scanner;

public class FirstOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octalNumber = sc.next();
        char octal[] = new char[octalNumber.length()];
        int a = octal.length-1;
        int calculation = 0;
        int out[] = new int[octal.length + 3];
        for (int i = octal.length-1; i == 0; i--) {
            octal[i] = octalNumber.charAt(i);
            calculation = (Integer.valueOf(octal[i]) * (int)Math.pow(8,a));
            a--;
            System.out.println(calculation);
        }
    }
}





//
//
//        for (int i = 0; i < octalNumber.length(); i++) {
//            octal[i] = octalNumber.charAt(i);
//            a = (int) (Integer.valueOf(octal[i]) * Math.pow(8,i));
//
//                if ((Integer.valueOf(octal[i]) % 2 == 1)) {
//                    out[i] = 1;
//                } else {
//                    out[i] = 0;
//                }
//                if (((Integer.valueOf(octal[i]) / 4) == 1)) {
//                    out[i + 1] = 0;
//                    out[i + 2] = 1;
//                } else {
//                    out[i + 1] = 0;
//                }
//                if (((Integer.valueOf(octal[i]) / 8) == 1)) {
//                    out[i + 2] = 0;
//                    out[i + 3] = 1;
//                }
//            }
////        for(int i = out.length; i <= 1; i--) {
//        for(int e : out)
//            System.out.print(e);
//        }
//    }
