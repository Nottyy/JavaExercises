public class Main {
    public static void main(String[] args) {
        int sum = getEvenDigitsum(-22);
        System.out.println(sum);
    }

    public static int getEvenDigitsum(int number){
        if (number < 0){
            return  -1;
        }

        int sum = 0;
        int digit = 0;

        while (number != 0){
            digit = number % 10;

            if (digit % 2 == 0){
                sum += digit;
            }
            number /= 10;
        }

        return  sum;
    }
}