package Aanand;

import java.util.Arrays;

public class array_sum{
    public static void main(String[] args) {
        int[] arr={45,62,31,75,94,56,12,75 };
        int sum=0;
        for (int i = 0; i <arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.print(sum+" is the sum of array");
    }
}
