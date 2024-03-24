package Arrays;

public class ReverseArray {


    static void Reverse(int[] arr){
        int last=arr.length-1,temp;
        //System.out.print(last);
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i]=arr[last];
            arr[last]=temp;
            last = last - 1;
        }
    }

    static void show(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr={85,58,46,25,94,67,95,45};
        System.out.println("\nThis Is The Data Before Reversing : ");
        show(arr);
        System.out.println("\n\nReversed Function Is Called And The Data Is Reversed ");
        Reverse(arr);
        System.out.println("\nThis Is The Data After Reversing The Array : ");
        show(arr);
    }

}
