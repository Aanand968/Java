package Aanand;
import java.util.Scanner;

public class alpha {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the char :");
       char c = sc.next().charAt(0);
        if (c=='a' ||c=='e' )
        {
            System.out.println("vowel");
        }
        sc.close();
    }
}
