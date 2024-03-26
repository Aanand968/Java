import java.util.*;

public class code6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for the solid rhombus ");
        System.out.print("Enter the number of sars : ");
        int n = sc.nextInt();
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // for (int j = 1; j <= (n * 2)-i; j++) {
            // if (j > n - i) {
            // System.out.print("*");
            // } else {
            // System.out.print(" ");
            // }
            // }

            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
        sc.close();
    }
}
