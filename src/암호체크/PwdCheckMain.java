package 암호체크;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PwdCheckMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PwdCheckClass pwdCheck = new PwdCheckClass();
        String pwd;
        while (true) {
            System.out.print("암호 입력 : ");
            pwd = sc.next();

            if(pwd.equals("종료")||pwd.equalsIgnoreCase("exit"))
                break;

            if(!pwdCheck.vaildLength(pwd)){
                System.out.println(("Bad Length password"));
                continue;
            }

            if(!pwdCheck.vaildNumber(pwd)){
                System.out.println(("Bad Number password"));
                continue;
            }

            if(!pwdCheck.vaildLowerAlphabet(pwd)){
                System.out.println(("Bad LowerAlphabet password"));
                continue;
            }

            if(!pwdCheck.vaildUpperAlphabet(pwd)){
                System.out.println(("Bad UpperAlphabet password"));
                continue;
            }

            if(!pwdCheck.vaildSpecialMark(pwd)){
                System.out.println(("Bad SpecialMark password"));
                continue;
            }
        }
    }
}
        //     String pwd[] =new String[30];
//        String pwd;
//        String str = "...";
//        Scanner sc = new Scanner(System.in);
//        String specialMark = "!%_#&+-*/";
//        int tmp;
//        int a = 0;
//        int b = 0;
//        while (true) {
//            System.out.print("비밀번호를 입력하세요 : ");
//            pwd = sc.next();
//            if (pwd.equalsIgnoreCase("종료") || (pwd.equalsIgnoreCase("exit"))) {
//                break;
//            } else {
//                if ((10 <= pwd.length()) || (pwd.length() <= 30)) {
//                    if (Pattern.matches(specialMark, pwd)) {
//                        for (int i = 0; i < pwd.length(); i++) {
//                            tmp = (int) pwd.charAt(i);
//                            if ((tmp >= 65) && (tmp <= 90)) {
//                                a++;
//                            }
//                            if ((tmp >= 65) && (tmp <= 90)) {
//                                b++;
//                            }
//                        }
//                        if (a > 0 || b > 0) {
//                            System.out.println("good password");
//                        } else {
//                            System.out.println("bad password");
//                        }
//                    } else {
//                        System.out.println("bad password");
//                    }
//                } else {
//                    System.out.println("bad password");
//                }
//            }
//        }
//    }
//}