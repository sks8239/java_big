package 배열의활용;

import java.util.Arrays;

public class ArrayApply {
    public static void main(String[] args) {
        int[] arr1 = {90, 45, 77, 80, 55};
//        int len = 10;
//        int [] arr2 = new int[len];
//        System.arraycopy(arr1,0,arr2,4,arr1.length);
//        for(int i = 0; i < arr1.length; i++){
//            arr2[i+3] = arr1[i];
//        }
        int[] arr3 = Arrays.copyOf(arr1, 10);
        System.out.println(Arrays.toString(arr3));
    }

}
