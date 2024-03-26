import java.util.*;

public class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Progrma to print butterfly pattern");
        System.out.print("Enter the number of Row : ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r * 2); j++) {
                if (j <= i || j > (r * 2) - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        int n=r;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r * 2); j++) {
                if (j <=n || j>=(r*2)-(r-i) ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            n--;
            System.out.println("");
        }
        sc.close();
    }

}
