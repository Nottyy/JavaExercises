import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = readIntegers();
        System.out.println(Arrays.toString(array));
        int min = findMin(array);
        System.out.println("Min is -> " + min);
    }

    private static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Please enter 5 integers: ");
        for (int i = 0; i < 5; i++){
            arr[i] = scanner.nextInt();
        }

        return arr;
    }
}