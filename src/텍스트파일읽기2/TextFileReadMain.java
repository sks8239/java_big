package 텍스트파일읽기2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class TextFileReadMain {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<StudentInfo> ts = new TreeSet<>();
        FileInputStream fis = new FileInputStream("src/텍스트파일읽기2/test.txt");
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) { // 읽어 들일 라인이 없을떄까지
            String line = sc.nextLine();
            String[] strArr = line.split(" ");
            ts.add(new StudentInfo(strArr[0],
                    Integer.parseInt(strArr[1]),
                    Integer.parseInt(strArr[2]),
                    Integer.parseInt(strArr[3])));
        }
        for (StudentInfo e : ts) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
    }
}
