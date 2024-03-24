package Aanand;

public class array_search {

    public static int sum(int a[],int end)
    {
        int num=0,index = 0;
        for (int i = 0; i < end ; i++) {
            if (num<a[i])
            {
                num=a[i];
            }
            index=i;
        }
        return index;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 5,9},
                {7, 3,5},
                {3, 5,9}};
        int[] arr2 = new int[arr.length];

        for (int i = 0; i <arr[1].length ; i++) {
            int sum=0;
            for(int j=0;j<arr.length;j++)
            {
             sum=sum + arr[i][j];
            }
            arr2[i]=sum;
        }
        int max=sum(arr2,arr2.length);
        System.out.println(max+" persion is the richest person among all with wealth = "+arr2[max]);

    }
}
