package 암호체크;

import java.util.regex.Pattern;
import java.util.Arrays;
public class PwdCheckClass {

    //길이 체크
    boolean vaildLength(String pwd) {
        if ((10 <= pwd.length()) || (pwd.length() <= 30)) {
            return true;
        }
        return false;
    }

    //숫자 체크
    boolean vaildNumber(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') {
                return true;
            }
        }
        return false;
    }

    //소문자 체크
    boolean vaildLowerAlphabet(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z') {
                return true;
            }
        }
        return false;
    }

    //대문자 체크
    boolean vaildUpperAlphabet(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z') {
                return true;
            }
        }
        return false;
    }

    boolean vaildSpecialMark(String pwd) {
        String specialMark = "!%_#&+-*/";
        String password[] = new String[pwd.length()];
        for(int i=0; i<pwd.length();i++) {
            password[i]= String.valueOf(pwd.charAt(i));
            if (specialMark.contains(password[i])) {
                return true;
            }
        }
        return false;
    }
}
