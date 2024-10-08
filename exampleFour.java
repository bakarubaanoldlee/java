import java.util.Scanner;

public class exampleFour {
    public static void main(String[] args) {
      //Accept user input eliminating errors
        Scanner scanner = new Scanner(System.in);
        int marks = 0;

        while (true) {
            System.out.println("Enter marks (numbers only):");
            if (scanner.hasNextInt()) {
                marks = scanner.nextInt();
                break;  
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();  
            }
        }
         
        // Evaluating the marks according to the provided criteria
        if (marks >= 90 && marks <= 100) {
            System.out.println(" Excellent");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println(" Very Good");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println(" Good");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println(" Medium");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println(" Pass");
        } else if (marks >= 0 && marks <= 49) {
            System.out.println(" Fail");
        }
        else{
            System.out.println("Invalid input: Marks should range from 0 to 100");
        }

        // Close the scanner
        scanner.close();
    }
}  
