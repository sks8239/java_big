package 배열로로또번호생성;

import java.util.Arrays;

// 1~45 사이의 임의의 수 6개로 구성
// 1. 배열로 로또 번호를 생성해 출력
// 2. 배열로 로또 번호 생성(중복 제거)
// 3. 다른 자료구조를 사용해 로또 번호 만들기
public class RandomLotto {
    public static void main(String[] args) {
        int[] number = new int[6];
        int tmp;
        int index = 0;
        boolean isExist = false;
        while(true){
            tmp = (int)((Math.random() * 45) + 1); // 1~45 랜덤 값 생성
            //중복확인구간
            for(int i = 0; i < number.length; i++) {
                if (number[i] == tmp) isExist = true;
            }
            if(isExist == false) //생성된 번호가 배열 내에 없으면 저장하는데. 인덱스 계산 해줘야 함
                number[index++] = tmp;
            if(index == number.length) //로또 번호가 5개 만들어졌으면 반복문 탈출
                break;
            isExist = false; //존재 여부 확인하는 변수를 초기화
        }
        System.out.println(Arrays.toString(number));
    }
}
