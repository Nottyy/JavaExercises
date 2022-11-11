public class Main {
    public static void main(String[] args) {
            int[] arr = new int[] { 5, 7, 1100, 2, 55, 22, 90, 1200, 5000};
            boolean[] boolArr = new boolean[arr.length];
            int pIndex = arr.length / 2;
    }

    public void quickSort(int[] arr, int index1, int index2, int pIndex){
        int pValue = arr[pIndex];


    }

    public int[] swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}