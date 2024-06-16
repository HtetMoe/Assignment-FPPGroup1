package assignment10_ErrorHandling.problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        while (true) {
            try {
                System.out.print("Enter a score between 0 and 100: ");
                score = scanner.nextInt();

                if (score < 0 || score > 100) {
                    throw new UnsupportedOperationException("Unsupported! -> Score must be between 0 and 100.");
                }
                break; // If the input is valid, break the loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! -> Please enter an integer value.");
                scanner.next(); //clear old input
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("You entered a valid score -> " + score);
        scanner.close();
    }
}
