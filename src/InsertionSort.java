public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{234, 5, 2, 636, 1, 24, 35, 22, 2, 3};
        System.out.println("Array: ");
        Ryve.printArrln(arr);
        int[] sorted = insertionSort(arr);
        System.out.println("Sorted: ");
        Ryve.printArrln(sorted);
    }

    private static int[] insertionSort(int[] array) {
        int[] arr = new int[array.length];
        System.arraycopy(array, 0, arr, 0, array.length);
        for(int cur_pos=0; cur_pos<arr.length; cur_pos++) {
            int temp = arr[cur_pos];
            for(int back=cur_pos - 1; back>=0; back--) {
                if(temp < arr[back]) {
                    arr[back + 1] = arr[back];
                    arr[back] = temp;
                }
            }
        }
        return arr;
    }
}
