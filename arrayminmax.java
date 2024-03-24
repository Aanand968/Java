package Aanand;
import java.util.Scanner;

public class arrayminmax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Program for min max number in array ");
        int size ;
        System.out.print("Enter the size of array : ");
        size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i <size ; i++) {
          arr[i]=sc.nextInt();
        }
        System.out.println("Your entered elements is :");
        for (int i = 0; i <size ; i++) {
            System.out.print( arr[i]+" " );
        }
        int num=0;
        for (int i = 0; i <size ; i++) {
            if (num<arr[i])
            {
                num=arr[i];
            }
        }
        System.out.print("\nyour maximum number in  the array is "+num+"\n\n");
        num=arr[0];
        for (int i = 0; i <size ; i++) {
            if (num>arr[i])
            {
                num=arr[i];
            }
        }
        System.out.print("your minimum number in  the array is "+num+"\n\n");
        sc.close();
    }

}
