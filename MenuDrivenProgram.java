import java.util.Scanner;

public class MenuDrivenProgram {

    public static void displayMenu() {
        System.out.println("Menu Options:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even or Odd");
        System.out.println("3. Exit");
    }

    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Thank you for using the program. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void greetUser() {
        System.out.println("Hello, Welcome!");
    }

    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                handleMenuChoice(choice);
            } else {
                System.out.println("Invalid input. Please enter a valid menu option.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}