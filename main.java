// Practicum 8 (Even or Odd Program)
// (TO COMPLETE)

// This program will prompt the user for an integer value
// and display whether it is even or odd.

// REQUIRED OUTPUT:
// The program MUST display the results exactly as shown below:
// <n> is odd
// <n> is even
// --------------------------------------------------------------
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int number;

        // Handle non-integer input
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // consume the invalid input
            System.out.print("Enter an integer: ");
        }

        number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        scanner.close();
    }
}

