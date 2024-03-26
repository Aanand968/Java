package Patterns;

public class Pattern5 {
    static void  patternnewstyle(int n ){
        int totalcol,spaces ;
        for (int i = 0 ; i < (n*2) ; i++){
            totalcol= (i<n) ? i:(n*2)-i-2;
            spaces=n-totalcol;
            for (int j=0; j <spaces; j++){
                System.out.print(" ");
            }
            for (int j = 0 ; j <= totalcol ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternnewstyle(5);
    }
}
