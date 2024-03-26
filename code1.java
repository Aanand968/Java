import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        System.out.println("Program to find Eligibel for Driving Licence or not");
        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 18) {
            System.out.println("\nYou are eligible for driving licence\n");
        } else {
            System.out.println("You are not eligible for driving licience");
        }
        sc.close();
    }
}
