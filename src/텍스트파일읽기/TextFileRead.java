package 텍스트파일읽기;

import java.io.*;
import java.util.Scanner;

public class TextFileRead {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("test.txt");
        Scanner sc = new Scanner(inputStream);
        int a = 0;
        String b = "";
        int cnt = 0;

        // test 가 몇 줄 짜리 문서인지 cnt 에 저장
        FileReader inputStream2 = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(inputStream2);
        while((b = br.readLine()) != null){
            cnt++;
        }

        Integer[] sum = new Integer[cnt];
        String[] name = new String[cnt];


        for (int i = 0; i < cnt; i++) {
            String line = sc.nextLine();
            String[] info = line.split(" ");
            sum[i] = Integer.parseInt(info[1]) + Integer.parseInt(info[2]) + Integer.parseInt(info[3]);
            name[i] = info[0];
        }
        for (int i = 0; i < cnt; i++) {
            for (int j = i + 1; j < cnt; j++) {
                // 총점 별 정렬
                if (sum[i] < sum[j]) {
                    a = sum[j];
                    sum[j] = sum[i];
                    sum[i] = a;

                    b = name[j];
                    name[j] = name[i];
                    name[i] = b;
                } else if (sum[i] == sum[j]) { // 총점이 같을 경우
                    if (name[i].compareTo(name[j]) > 0) { // 문자열 비교
                        b = name[j];
                        name[j] = name[i];
                        name[i] = b;
                    }
                }
            }
        }
        for (int i = 0; i < cnt; i++) {
            System.out.println(name[i] + " : " + sum[i]);
        }
    }
}
