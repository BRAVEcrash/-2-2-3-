import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

    public void compute() {
        Random random = new Random();
        int answer = random.nextInt(20) + 1;  // Random number between 1 and 20
        Scanner scanner = new Scanner(System.in);
        int guess, attempts = 0;

        System.out.println("(Problem 2) ============");
        while (true) {
            System.out.print("Guess the answer: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < answer) {
                System.out.println("The given integer is low.");
            } else if (guess > answer) {
                System.out.println("The given integer is high.");
            } else {
                System.out.println("Congratulations. Number of attempts = " + attempts);
                break;
            }
        }
        System.out.println("(End of 2) ============");
    }
}
