
import java.util.Scanner;
import java.util.Random;
public class Random_Num {
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Welcome to the Number Guessing Game!-----");
        Random ran = new Random();
        int targetNum = ran.nextInt(100)+1;
        int count = 0;

        while (true) {
            System.out.print("Guess a number between 1 and 100: ");
            int guess = sc.nextInt();
            count++;

            if (guess < targetNum) {
                System.out.println("-----Try a higher number-----");
            } else if (guess > targetNum) {
                System.out.println("-----Try a lower number-----");
            } else {
                System.out.println("Congratulations! You guessed the number " + targetNum + " in " + count + " attempts.");
                break;
            }
        }

        sc.close();
    }
}
}
