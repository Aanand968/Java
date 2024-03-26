public class Recursion_Power {

    public static int RecPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xpower = RecPower(x, n - 1);
        int power = x * xpower;
        return power; 
    }

    public static void main(String[] args) {
        int a = 2, n = 5;
        int ans = RecPower(a, n);
        System.out.println("The answer is " + ans);
    }
}