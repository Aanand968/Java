public class bubble_sort_new {
    public static void show(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 7, 8, 2, 5, 3, 6, 1, 9 };
        int temp, count = 0, i = 0;

        while (i < arr.length - 1) {
            if (count >= arr.length - 1 - i) {
                count = 0;
                i++;
            } else {
                if (arr[count] > arr[count + 1]) {
                    temp = arr[count];
                    arr[count] = arr[count + 1];
                    arr[count + 1] = temp;
                }
                count++;
            }
        }
        // print the sorted array
        show(arr);
    }
}