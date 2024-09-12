import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

    public void compute() {
        Random random = new Random();
        int answer = random.nextInt(20) + 1;  // Random number between 1 and 20
        Scanner scanner = new Scanner(System.in);
        int guess, attempts = 0;

        System.out.println("(2번문제) ============");
        while (true) {
            System.out.print("정답을 추측하여 보시오: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < answer) {
                System.out.println("제시한 정수가 낮습니다.");
            } else if (guess > answer) {
                System.out.println("제시한 정수가 높습니다.");
            } else {
                System.out.println("축하합니다. 시도횟수 = " + attempts);
                break;
            }
        }
        System.out.println("(2번종료) ============");
    }
}
