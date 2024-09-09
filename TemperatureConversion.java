import java.util.Scanner;

public class TemperatureConversion {

    public void compute() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("(Problem 1) ============");
            System.out.println("1. Fahrenheit -> Celsius");
            System.out.println("2. Celsius -> Fahrenheit");
            System.out.println("3. End temperature conversion problem");
            System.out.println("=====================");
            System.out.print("Select a number: ");
            choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("(End Problem 1) ============");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the Fahrenheit temperature: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.println("The Celsius temperature is " + celsius);
                    break;
                case 2:
                    System.out.print("Enter the Celsius temperature: ");
                    celsius = scanner.nextDouble();
                    fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println("The Fahrenheit temperature is " + fahrenheit);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
