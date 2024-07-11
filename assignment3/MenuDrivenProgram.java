
import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate volume of cylinder");
            System.out.println("2. Find factorial of a number");
            System.out.println("3. Check if a number is Armstrong");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateVolumeOfCylinder();
                    break;
                case 2:
                    findFactorial();
                    break;
                case 3:
                    checkArmstrong();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void calculateVolumeOfCylinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double h = scanner.nextDouble();

        double volume = Math.PI * r * r * h;
        System.out.println("Volume of Cylinder: " + volume);
    }

    private static void findFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + ": " + factorial);
    }

    private static void checkArmstrong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
