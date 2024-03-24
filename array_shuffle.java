package Aanand;

import java.util.Arrays;

public class array_shuffle {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        int n=3,b=0;
        int[] arr1 =new int[arr.length];
        for (int i =0; i <arr.length ; i++) {
            if (i%2==0) {
                arr1[i] = arr[b];
                b++;
            }
            else {
            arr1[i]=arr[n];
            n++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
