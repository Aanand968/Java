
public class Swap {

    static void swapnum(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Methods variable :");
        System.out.print(a + " " + b);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        swapnum(a, b);
        System.out.println("\nMain variable : ");
        System.out.print(a + " " + b);
    }
}
