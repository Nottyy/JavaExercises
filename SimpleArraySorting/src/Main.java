import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 22, 11, 1, 0, 9, 33, 4, 2, 8};
        printIntArray(arr);
        System.out.println();
        int[] sortedArr = sortIntegers(arr);
        printIntArray(sortedArr);
    }

    private static void printIntArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private static int[] sortIntegers(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArr.length - 1; i++) {
                if (sortedArr[i] > sortedArr[i + 1]) {
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArr;
    }
}