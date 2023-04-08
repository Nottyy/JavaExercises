public class Main {
    public static void main(String[] args) {
        var arr = new int[1000000];
        int target = 42;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int index = binarySearch(arr, target);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr, int target) {
        var low = 0;
        var high = arr.length - 1;

        while (low <= high) {
            int middleId = low + ((high - low) / 2);
            int middle = arr[middleId];
            System.out.println("Element ID -> " + middle);
            if (target > middle){
                low = middleId + 1;
            }
            else if(target < middle){
                high = middle - 1;
            }
            else{
                return middleId;
            }
        }

        return -1;
    }
}