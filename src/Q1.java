// Name: Sanskriti Avinash Dabhade
// Student ID: 1225131 | Assignment 02
// Code Structure:

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args){
        // Ask user for end value in range 1 to N.
        int endVal;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive end value for the range: ");
        endVal = sc.nextInt();
        sc.close();

        System.out.println();

        // Checking input: should be a positive integer
        if (endVal <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Number of guesses = Divide the number by 2 until 1 is reached + 1.
        int counter = 0;
        do{
            endVal /= 2;
            counter++;
        } while (endVal > 1);

        counter++;

        // Print the total number of guesses it would take.
        System.out.printf("Total number of guesses it would take: %d", counter);
        System.out.println();

    }
}
