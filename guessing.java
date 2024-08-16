import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;

        Scanner scanner = new Scanner(System.in);
        int guess;

        while (true) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("You won! The number was " + numberToGuess);
                System.out.println("It took you " + numberOfTries + " tries.");
                break;
            }
        }
    }
}
