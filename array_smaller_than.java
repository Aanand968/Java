package Aanand;

public class array_smaller_than {
    public static void main(String[] args) {
        int[] arr ={ 45,62,31,75,94 };

        for (int i = 0; i <arr.length ; i++) {
            int count=0;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]>arr[j]) {
                  count++;
                }
                }
            System.out.print(count+" ");
            }
        }
    }
