// import java.util.*;

public class bit {
    public static void main(String[] args) {
        int n= 4; 
        int pos= 2; 
        int bitmask =  1<<pos;
        if ((bitmask & n)==0) {
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was non zero");
        }


    }
}
