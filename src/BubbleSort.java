import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 2, 3, 1, 9, 3, 5, 4};
        int[] sorted = bubbleSort(arr);
        System.out.println("Array: ");
        Ryve.printArrln(arr);

        System.out.println("\nSorted: ");
        Ryve.printArrln(sorted);
    }

    private static int[] bubbleSort(int[] unsorted_arr) {
//        int[] arr = new int[unsorted_arr.length];
        for (int i = 0; i < unsorted_arr.length; i++) {
            for (int j = 0; j < unsorted_arr.length - i - 1; j++) {
                if (unsorted_arr[j] > unsorted_arr[j + 1]) {
                    int temp = unsorted_arr[j + 1];
                    unsorted_arr[j + 1] = unsorted_arr[j];
                    unsorted_arr[j] = temp;
                }
            }
        }

        return unsorted_arr;
    }
}
