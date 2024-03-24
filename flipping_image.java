package Aanand;

public class flipping_image {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0, 0},
                       {1, 0, 0, 1},
                       {0, 1, 1, 1},
                       {1, 0, 1, 0}
        };
        System.out.println("Your image is :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        int a;
        System.out.println("length : "+arr.length/2);
        for (int i = 0; i < arr.length; i++) {
            int l = 0, k = arr.length - 1;
            for (int j = 0; j < (arr[0].length / 2); j++) {
                a = arr[i][l];
                arr[i][l] = arr[i][k];
                arr[i][k] = a;
                l++;
                k--;
            }
        }
        System.out.println("After reversing  the image :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }
        System.out.println("Your image after flipping :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
