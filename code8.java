import java.util.*;

public class code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for Palindromic Pattern\n ");
        System.out.print("Enter the size of Palindrom : ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for reverse printing
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "");
            }
            // for forward pringting
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println("");
        }
    }
}
