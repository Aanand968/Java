public class code9 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("\nProgram to print Diamond pattern\n");
        // First Half
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // Second Half
        for (int i = n; i >= 1; i--) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
