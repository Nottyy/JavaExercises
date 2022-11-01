public class Main {
    public static void main(String[] args) {
// Write a method named hasSameLastDigit with three parameters of type int.
// Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
// The mehod should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
        boolean result = hasSameLastDigit(19, 23, 34);

        System.out.println(result);

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (num1 < 10 || num2 < 10 || num3 < 10 || num1 > 1000 || num2 > 1000 || num3 > 1000){
            return  false;
        }

        int num1RightDigit = num1 % 10;
        int num2RightDigit = num2 % 10;
        int num3RightDigit = num3 % 10;

        return num1RightDigit == num2RightDigit || num1RightDigit == num3RightDigit || num2RightDigit == num3RightDigit;
    }
}