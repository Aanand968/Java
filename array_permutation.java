package Aanand;

public class array_permutation {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 3, 4};
        System.out.println("Main array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNew array :");
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr[i]];
            System.out.print(arr1[i] + " ");
        }
    }
}
