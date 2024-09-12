import java.util.Scanner;

public class TemperatureConversion {

    public void compute() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("(1번문제) ============");
            System.out.println("1. 화씨 -> 섭씨");
            System.out.println("2. 섭씨 -> 화씨");
            System.out.println("3. 온도 변환 문제 종료");
            System.out.println("=====================");
            System.out.print("번호를 선택하시오: ");
            choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("(1번종료) ============");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("화씨온도를 입력하시오: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.println("섭씨온도는 " + celsius);
                    break;
                case 2:
                    System.out.print("섭씨온도를 입력하시오: ");
                    celsius = scanner.nextDouble();
                    fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println("화씨온도는 " + fahrenheit);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
