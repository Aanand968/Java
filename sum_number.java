package Aanand;
import java.io.PrintStream;
import java.util.Scanner;
public class sum_number {
    public static void main(String[] args) {
        int sum = 0, add = 0,  neg = 0, start, end;
        PrintStream ps = new PrintStream(System.out);
        Scanner s = new Scanner(System.in);
        ps.println("ENTER START AND END : ");
        start = s.nextInt();
        end = s.nextInt();
        for (int i = start; i <= 0; i++) {
            neg = neg + i;
        }
        ps.println("SUM OF NEGATIVE NUMBER : " + neg);
        for (int i = 1; i <= end; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            } else {
                add = add + i;
            }
        }
        ps.println("SUM OF positive even NUMBER : " + sum);
        ps.println("Sum of odd :" + add);
        s.close();
    }
}
