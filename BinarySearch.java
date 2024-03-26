package RECURSION;

public class BinarySearch {

    static int search(int arr[], int target , int s , int e ){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if (arr[m]==target){
            return m;
        }
        if (target < arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target,m+1, e);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8,22,44,55,66,77,78,99};
        int target = 77;
        int ans = search(arr, target,0, arr.length );
        System.out.println("Number is at : "+ans);
    }
}
