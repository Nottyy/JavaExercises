import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8};
        arrSwap(arr);
        // 1, 2, 3, 4, 5, 6, 7
    }

    private static void arrSwap(int[] arr) {
        System.out.println("Initial arr -> " + Arrays.toString(arr));
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Swapped arr -> " + Arrays.toString(arr));
    }
}