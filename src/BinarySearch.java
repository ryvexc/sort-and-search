public class BinarySearch {
    private static final String middle_color = "\033[0;31m";
    private static final String found_color = "\033[0;32m";

    public static void main(String[] args) throws InterruptedException {
         int[] arr = new int[]{53, 3, 45, 5565, 23, -234, -3, 74, 0, 357, 234, 22, 53, -25};
         int target = 357;
         System.out.print("Array: ");
         Ryve.printArrln(arr);
         System.out.printf("Target: %d\n", target);
         System.out.println("Sorting element...");
         mergeSort(arr);
         System.out.println("Array sorted.");
         Ryve.printArrln(arr);
         System.out.println("Searching...\n");
         int idx = binarySearch(arr, target);
         if(idx == -1) System.out.println("\nElement not found!.");
         else System.out.println("\nElement found!.");
         System.out.print("[");
         for(int i=0; i<arr.length; i++) System.out.printf("%s%d%s%s", arr[i] == target ? found_color : "", arr[i], arr[i] == target ? "\033[0m" : "", i < arr.length - 1 ? ", " : "");
         System.out.println("]");
    }

    private static int binarySearch(int[] arr, int target) throws InterruptedException {
        int start = 0, end = arr.length - 1;

        while(start <= end) {
            int mid_idx = start + ((end - start) / 2);
            System.out.print("[");
            for(int i=start; i<=end; i++) System.out.printf("%s%s", i == mid_idx ? (found_color + String.valueOf(arr[i]) + "\033[0m") : String.valueOf(arr[i]), (i < end ? ", " : ""));
            System.out.println("]");
//            Ryve.printArrln(arr, start, end);
//            System.out.printf("Middle: %d\n\n", arr[mid_idx]);
            if(target < arr[mid_idx]) {
                end = mid_idx - 1;
            } else if(target > arr[mid_idx]) {
                start = mid_idx + 1;
            } else if(target == arr[mid_idx]) {
                return mid_idx;
            }
            Thread.sleep(250);
        }

        return -1;
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
