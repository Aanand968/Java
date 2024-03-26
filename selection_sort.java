public class selection_sort {
    public static void show(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 7, 8, 2, 5, 3, 6, 1, 9 };
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            // Find the minimum element in unsorted array
            for (int j = i+1; j < arr.length - 1; j++) {
                if (arr[smallest]>arr[j]) {
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        show(arr);
    }
}
