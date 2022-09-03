public class Ryve {
    public static void printArrln(int[] arr) {
        System.out.print("[");
        for(int i=0; i<arr.length; i++) System.out.printf("%d%s", arr[i], (i < arr.length - 1? ", " : ""));
        System.out.println("]");
    }

    public static int[] createCopy(int[] real_arr) {
        int[] new_arr = new int[real_arr.length];
        System.arraycopy(real_arr, 0, new_arr, 0, real_arr.length);
        return new_arr;
    }

    public static void printArrln(int[] arr, int start, int end) {
        System.out.print("[");
        for(int i=start; i<=end; i++) System.out.printf("%d%s", arr[i], (i < end ? ", " : ""));
        System.out.println("]");
    }
}
