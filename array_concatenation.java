package Aanand;

import java.util.Arrays;

public class array_concatenation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,1};
        int a = arr.length;
        int b=0;
        int[] arr1 = new int[a*2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < a; j++) {
                arr1[b]=arr[j];
                b++;
            }
        }
            System.out.print(Arrays.toString(arr1));
    }
}
