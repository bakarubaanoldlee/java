// Java program that checks if a number is positive,
// negative, or zero using if-else statements.
import java.util.Scanner;

public class exampleThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is postive. ");
        } else if (number < 0) {
            System.out.println("The number is negative. ");
        } else {
            System.out.println("The number is Zero. ");

        }
        scanner.close();
    }
}