import java.util.*;

public class array1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int marks[]=new int[3];
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 93;
        marks[2] = 99;
        System.out.println("Marks of the student are:");
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);

        }

        sc.close();
    }
}
