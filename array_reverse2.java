package Aanand;

import java.util.Arrays;

public class array_reverse2 {
    public static void main(String[] args) {
        int[] arr ={ 45,62,31,75,94,56,12,75 };
        int start =0;
        int end= (arr.length-1);
        int temp;
        while(start<end) {
            temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        }

    }

