package 정적메소드;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Util {
    public final static String DomainName = "http:://192.168.0.14/index";
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}