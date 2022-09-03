import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{342, 2, 345, 1231, 3, -23, -234, 23, 663, 2, 47};
        System.out.println("Array: ");
        Ryve.printArrln(arr);
        int[] sorted = selectionSort(arr);
        System.out.println("Sorted: ");
        Ryve.printArrln(sorted);
    }

    private static int[] selectionSort(int[] real_arr) {
        int[] arr = Arrays.copyOf(real_arr, real_arr.length);
        for(int i=0; i<arr.length; i++) {
            int temp = arr[i];
            for(int chk=i; chk<arr.length; chk++) {
                if(temp > arr[chk]) {
                    arr[i] = arr[chk];
                    arr[chk] = temp;
                    i--;
                    break;
                }
            }
        }
        return arr;
    }
}
