public class Main {
    public static void main(String[] args) {
        boolean result = canPack (2, 2, 11);
        System.out.println(result);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if (goal % 5 == 0){
            if ((goal / 5) <= bigCount){
                return  true;
            }
        } else if (goal <= smallCount) {
            return  true;
        }

        if ((bigCount * 5) < goal){
            int diff = goal - (bigCount * 5);

            if (diff <= smallCount){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            int diff = goal % 5;

            if (diff <= smallCount){
                return true;
            }
            else {
                return false;
            }
        }
    }
}