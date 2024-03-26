public class Recursion2 {

    public static void Sum(int n, int sum) {

        if (n == 0) {
            System.out.println("The Sum is :" + sum);
            return;
        }
        sum = sum + n;
        Sum(n - 1, sum);
        System.out.println(n);

    }

    public static void main(String[] args) {

        int n = 5 ;
        Sum(n, 0);

    }
}
