public class insertion_sort {
    public static void show(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 7, 4, 2, 5, 3, 6, 1, 9 };
        int current, j;

        for (int i = 0; i < arr.length - 1; i++) {
            current = arr[i+1];
            j = i ;
            while (j >= 0 && current < arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        show(arr);
    }
}
