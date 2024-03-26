package Patterns;

public class Pattern4 {
    static void pattern(int n ){

        for(int i = 0 ; i < n ; i++){
            for (int j =0 ; j < i ; j++){
                System.out.print( "* ");
            }
            System.out.println();
        }
        for(int i = 0 ; i < n ; i++){
            for (int j =0 ; j < n-i ; j++){
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
    static void patternnew(int n ){
        n=2*n-1;
        for (int i = 0 ; i<n; i++){
            if (i<5){
                for (int j = 0 ; j<=i ; j++){
                    System.out.print("* ");
                }
            }
            else{
                for (int j = 0 ; j <n-i; j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void  patternnewstyle(int n ){
        int totalcol ;
        for (int i = 0 ; i < (n*2) ; i++){
         totalcol= (i<n) ? i:(n*2)-i-2;
         for (int j = 0 ; j <= totalcol ; j++){
             System.out.print("* ");
         }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //pattern(5);
        //patternnew(5);
        patternnewstyle(5);
    }




}
