import java.util.*;

public class string2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to reverse a stritgn \n");
        System.out.print("Enter the Strins :");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int front, back;
        char frontchar, backchar;
        for (int i = 0; i < sb.length() / 2; i++) {
            front = i;
            back = sb.length() - 1 - i;

            frontchar = sb.charAt(i);
            backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println("\nYour reversed strign is : ");
        System.out.print(sb);

        sc.close();
    }
}
