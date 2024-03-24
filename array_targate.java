package Aanand;

import java.util.Arrays;

public class array_targate {
    public static void main(String[] args) {
       int[] num = {0,1,2,3,4};
       int[] index = {0,1,2,2,1};
       int[] target =new int[num.length];
        for (int i = 0; i <num.length ; i++) {
            target[index[i]]=num[index[i]];
        }
        System.out.println(Arrays.toString(target));
    }
}
