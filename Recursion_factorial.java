public class Recursion_factorial {

    public static int Factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int num = Factorial(n - 1);
        int fact = n * num;
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = Factorial(n);
        System.out.println("The Factorial is : " + ans);

    }

}
