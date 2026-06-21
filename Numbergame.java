import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("====================================");
        System.out.println("      WELCOME TO NUMBER GAME");
        System.out.println("====================================");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("------------------------------------");

        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too High! Try Again.");
            } else if (guess < secretNumber) {
                System.out.println("Too Low! Try Again.");
            } else {
                System.out.println("------------------------------------");
                System.out.println("Congratulations!");
                System.out.println("You guessed the correct number.");
                System.out.println("Number : " + secretNumber);
                System.out.println("Attempts : " + attempts);
                System.out.println("------------------------------------");
            }
        }

        sc.close();
    }
}