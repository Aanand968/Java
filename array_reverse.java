package Aanand;

public class array_reverse {
    public static void main(String[] args) {
        int[] arr = {45, 65, 75, 84, 323};
        int[] arr1 = new int[arr.length];
        System.out.println("Your entered array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        int j = (arr.length - 1);
        System.out.println("\nAfter reversing :");
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[j];
            System.out.print(arr1[i] + " ");
            j--;
        }
    }
}
