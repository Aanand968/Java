public class insertion_sort_new {
    public static void show(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 7, 4, 2, 6, 5, 3, 9 };
        int current, count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            current = arr[i + 1];
            for (int j = i; j >= 0; j--) {
                if (current < arr[j]) {
                    System.out.println("current value : " + current);
                    System.out.println("previous value arr[j] : " + arr[j]);
                    arr[j + 1] = arr[j];
                    count = j;
                    System.out.println("count value : " + count);
                }
            }
            if (arr[count] >= current) {
                arr[count] = current;
            }
            System.out.println("Array now :");
            show(arr);
        }

    }
}
