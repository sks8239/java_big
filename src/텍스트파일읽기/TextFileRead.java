package 텍스트파일읽기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TextFileRead {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream("test.txt");
        Scanner sc = new Scanner(inputStream);
        int[] sum = new int[10];
        for (int i = 0; i < 10; i++) {
            String line = sc.nextLine();
            String[] info = line.split(" ");
            sum[i] = Integer.parseInt(info[1]) + Integer.parseInt(info[2]) + Integer.parseInt(info[3]);
        }
        Arrays.sort(sum, Collections.reverseOrder());
        System.out.println(Arrays.toString(sum));
    }
}
//[222, 190, 168, 294, 293, 252, 279, 272, 146, 179]
