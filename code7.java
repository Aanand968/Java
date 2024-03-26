import java.util.*;

public class code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print Number Pyramid ");
        System.out.print("Enter the size of the Pyramid : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");

        }
        sc.close();
    }
}
