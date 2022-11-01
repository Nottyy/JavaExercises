public class Main {
    public static void main(String[] args) {
// Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
// If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
// The method should return the greatest common divisor of the two numbers (int).
// The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
        int result = getGreatestCommonDivisor(9, 18);
        System.out.println(result);
    }

    public static int getGreatestCommonDivisor (int num1, int num2){
        if (num1 < 10 || num2 < 10){
            return -1;
        }

        int smallerNum = num1 < num2 ? num1 : num2;

        for (int i = smallerNum; i > 0; i--){
            if (num1 % i == 0 && num2 % i == 0){
                return i;
            }
        }

        return 1;
    }
}