package Patterns;

public class Pattern3 {
    static void patter(int n ){
        for(int i = 0 ; i <= n ; i++){
            for (int j =1 ; j <= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patter(5);
    }

}
