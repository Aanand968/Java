package Arrays;

public class Array_permutation {
    public static void main(String[] args) {
         int[]  nums ={0,2,1,5,3,4}, ans=new int[nums.length];
         System.out.println("Your zero based permutation is :");
        for (int i = 0; i <nums.length ; i++) {
            ans[i]=nums[nums[i]];
            System.out.print(ans[i]+" ");
        }
    }
}
