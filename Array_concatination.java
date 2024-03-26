package Arrays;
import java.util.Arrays;

public class Array_concatination {
    public static void main(String[] args) {
        int[] num={1,2,1} , ans= new int[2*(num.length)];

        for (int i = 0; i < num.length ; i++) {
            ans[i]=num[i];
            ans[i+num.length]=num[i];
        }
        System.out.print(Arrays.toString(ans));
    }
}
