public class Main {
    public static void main(String[] args) {
        boolean result = isPerfectNumber();
        System.out.println(result);
    }

    public static boolean isPerfectNumber(int num){
        if (num < 1){
            return false;
        }
        int sum = 0;

        for (int i = num / 2; i > 0; i--){
            if (num % i == 0){
                sum += i;
            }
        }

        return sum == num ? true : false;
    }
}