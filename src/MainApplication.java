import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Please enter your age: ");
                int age = scanner.nextInt();
                BirthYearCalculator calculator = new BirthYearCalculator(age);
                System.out.println("Your birth year is: " + calculator.getBirthYear());
                validInput = true;
            } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input. Age is invalid.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
