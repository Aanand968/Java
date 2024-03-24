package Aanand;

public class array_good_pair {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,1};
        System.out.println("good pairs are :");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j] && i < j)
                {
                    System.out.print("["+i+","+j+"], ");
                }
            }
        }
    }
}
