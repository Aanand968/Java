import java.util.Scanner;

public class function1 {

    //function for fibonacciseries
    public static void FibonacciSeries(int x, int y) {
        int z = x + 1;
        System.out.print(x + " " + z + " ");
        int sum;
        for (int i = 1; i <= y; i++) {
            sum = x + z;
            System.out.print(sum + " ");
            x = z;
            z = sum;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to print Fibonacci series \n ");
        System.out.print("Enter the starting number : ");
        int x = sc.nextInt();
        System.out.print("Enter the total number of instance : ");
        int y = sc.nextInt();
        FibonacciSeries(x, y);
        sc.close();
    }
}