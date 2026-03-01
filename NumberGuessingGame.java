import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Number Guessing Game
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);
        int attempts = 0;

        System.out.println("Number Guessing Game");
        do {
            System.out.printf("Guess a number between %d-%d: ", min, max);
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber) {
                System.out.println("Too low! Try Again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try Again.");
            } else {
                System.out.println("Correct! The number was " + randomNumber);
                System.out.println("Number of Attempts: " + attempts);
            }
        } while(guess != randomNumber);

        scanner.close();
    }
}
