package Arrays;

public class MinMax {

    static void Min(int[] arr){
        int length = arr.length, number=arr[0];
        for (int i = 1; i < length; i++) {
                       if (number>arr[i]){
                           number=arr[i];
                       }
        }
        System.out.println("The Minimum number in the array is "+number);
    }

    static void Max(int[] arr){
         int length = arr.length, number = arr[0];
        for (int i = 1; i < length; i++) {
            if(number<arr[i])
            {
                number= arr[i];
            }
        }
        System.out.println("The Maximum number in the array is "+ number);
    }

    public static void main(String[] args) {
        int[] arr={45,24,96,57,12,58,62,43,59,83,21,34,75,16,86};
        Min(arr);
        Max(arr);
    }
}
