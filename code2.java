import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your case : ");
        int cas =sc.nextInt();
          switch (cas) {
            case 1:
                System.out.println("Namastay");
                break;
            case 2: 
            System.out.println("Hello");
            break;
            default:
            System.out.println("Invalid Case");
                break;
          }
          sc.close();
    }
}
