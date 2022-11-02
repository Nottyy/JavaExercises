import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//  Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//  The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
//  When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
//  XX represents the sum of all entered numbers of type int.
//  YY represents the calculated average of all numbers of type long.

    inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (scanner.hasNextInt()){
            sum += scanner.nextInt();
            counter++;
        }

        scanner.close();
        long average = Math.round(sum / counter);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}