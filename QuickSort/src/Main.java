public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{55, 7, 11, 21, 55, 2, 90, 52, 50, 4};
        printNumbers(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println();
        printNumbers(arr);
    }
    public static void printNumbers(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high){
            return;
        }
        int pivot = arr[high];

        int leftpointer = low;
        int rightpointer = high;

        while (leftpointer < rightpointer) {
            while (arr[leftpointer] <= pivot && leftpointer < rightpointer) {
                leftpointer++;
            }

            while (arr[rightpointer] >= pivot && leftpointer < rightpointer) {
                rightpointer--;
            }

            swap(arr, leftpointer, rightpointer);
        }
        swap(arr, leftpointer, high);

        quickSort(arr, low, leftpointer - 1);
        quickSort(arr, leftpointer + 1, high);
    }

    public static int[] swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }
}