

import java.util.Scanner;

public class second extends first {
    void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" first number : ");
        a = sc.nextInt();
        System.out.print(" second number : ");
        b = sc.nextInt();
        c = a + b;
        System.out.println(" Your Answer is " + c);
        sc.close();
    }

    public static void main(String[] args) {
        second sec = new second();
        sec.add();

    }
}
