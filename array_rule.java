package Aanand;

import java.util.Arrays;

public class array_rule {
    public static void main(String[] args) {
        String value = "silver";
        String[][] arr = {{"phone", "blue", "pixel"},
                {"computer", "silver", "lenovo"},
                {"phone", "gold", "iphone"}
        };
        System.out.println("Your array is :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        //checking the silver color for the item
        int[] arr2 = new int[arr.length];
        int c = 0, d = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (Arrays.asList(arr[i][j]).contains(value)) {
                    arr2[c] = i;
                    d++;
                }
            }
        }
        //print item with the silver color
        System.out.println("Matched item :");
        for (int j = 0; j < d; j++) {
            for (int k = 0; k < arr[0].length; k++) {
                System.out.print(arr[arr2[j]][k] + " ");
            }
            System.out.print("\n");
        }
    }
}
