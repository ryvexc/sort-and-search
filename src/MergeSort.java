public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{-234, 3, 6, 3, 2, 6, 2343, 3463, 465, 734};
        System.out.println("Array: ");
        Ryve.printArrln(arr);
        System.out.println("Sorted: ");
        mergeSort(arr);
        Ryve.printArrln(arr);
    }

    private static void mergeSort(int[] arr) {
        if(arr.length <= 1) return;
        int[] left_arr = new int[arr.length / 2];
        int[] right_arr = new int[arr.length - left_arr.length];

        int rpos = 0;
        for(int i=0; i<arr.length; i++) {
            if(i < arr.length / 2) left_arr[i] = arr[i];
            else {
                right_arr[rpos] = arr[i];
                rpos++;
            }
        }

//        Ryve.printArrln(left_arr);
//        Ryve.printArrln(right_arr);
        mergeSort(left_arr);
        mergeSort(right_arr);
        merge(left_arr, right_arr, arr);
    }

    private static void merge(int[] left_arr, int[] right_arr, int[] arr) {
        int l_pos = 0, r_pos = 0, a_pos = 0;
        while(l_pos < left_arr.length && r_pos < right_arr.length) {
            if(left_arr[l_pos] < right_arr[r_pos]) {
                arr[a_pos] = left_arr[l_pos];
                a_pos++;
                l_pos++;
            } else {
                arr[a_pos] = right_arr[r_pos];
                a_pos++;
                r_pos++;
            }
        }

        while(l_pos < left_arr.length) {
            arr[a_pos] = left_arr[l_pos];
            a_pos++;
            l_pos++;
        }

        while(r_pos < right_arr.length) {
            arr[a_pos] = right_arr[r_pos];
            a_pos++;
            r_pos++;
        }
    }
}
