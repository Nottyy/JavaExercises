public class Main {
    public static void main(String[] args) {
//        Shared Digit
//        Write a method named hasSharedDigit with two parameters of type int.
//        Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
        boolean check = hasSharedDigit(9, 99);
        System.out.println(check);
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if (num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99){
            return false;
        }
        int firstDigitInNum1 = num1 / 10;
        int secondDigitInNum1 = num1 % 10;

        int firstDigitInNum2 = num2 / 10;
        int secondDigitInNum2 = num2 % 10;
        
        if (firstDigitInNum1 == firstDigitInNum2 || firstDigitInNum1 == secondDigitInNum2 ||
            secondDigitInNum1 == firstDigitInNum2 || secondDigitInNum1 == secondDigitInNum2){
            return true;
        }
        else {
            return false;
        }
    }
}