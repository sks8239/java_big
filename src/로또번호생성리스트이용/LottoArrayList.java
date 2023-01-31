package 로또번호생성리스트이용;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LottoArrayList {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int tmp;
        while (true) {
            tmp = (int)((Math.random() * 45) +1 );
            set.add(tmp);
            if(set.size() == 6) break;
        }
        for (Integer e : set) System.out.print(e + " ");
    }
}
