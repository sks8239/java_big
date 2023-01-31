package HashSet응용;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

//문제 : 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로글매 작성
//1. 길이가 짧은 순
//2. 길이가 같으면 사전순
//3. 중복 제거
public class HashSetApplyEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] word = new String[n]; // n개의 문자열 배열 생성
//        sc.nextLine(); // 버퍼 비우기(개행문자가 다음 입력으로 들어가는걸 방지 하기 위해)
        for (int i = 0; i < n; i++) {
            word[i] = sc.next();
        }
        // set 컬렉션의 특징을 이용해 중복 제거 하기 : 순서 보장 안함, 중복 허용 안함
        // 문자열 배열을 set 컬렉션으로 만들 때 이미 중복 제거 됨
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word));
        // String[0] : 원래 생성된 크기를 만큼을 반환한다는 의미(배열 크기 자동 지정)
        word = hashSet.toArray(new String[0]); // set을 다시 배열로 변환
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 길이가 같은 경우 사전 순 정렬
                } else {
                    return o1.length() - o2.length(); // o1 길이가 길면 양수
                }
            }
        });
        for (String e : word) {
            System.out.print(e + " ");
        }
    }
}
