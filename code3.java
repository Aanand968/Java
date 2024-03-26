import java.util.*;

public class code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Progrma to print star pattern");
        
        /*                    *
                            * *
                          * * *
                        * * * *
                      * * * * *  
         */  
        System.out.print("Enter the number of Row : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of colom : ");
        int c = sc.nextInt();
        int n = c;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (j < n) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
            n--;
            System.out.println("");
        }
        sc.close();
    }

}
