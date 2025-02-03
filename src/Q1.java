// Name: Sanskriti Avinash Dabhade
// Student ID: 1225131 | Assignment 02 | Question 01
/* Code Structure: In this program, the user is first asked for an end value N (range 1 - N).
An if-statement validates whether the input is a positive integer or not. Further, a counter variable is
initialised to 0 and a do-while loop is implemented. do-while loop runs until the end value is divided to get
a 1 at the end. The counter keeps incrementing while the condition is true. Out of the loop, counter is incremented
one more time for the last division. The program exits after printing the total guesses it would take (counter).
*/

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args){
        // Ask user for end value in range 1 to N.
        int endVal;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive end value for the range: ");
        endVal = sc.nextInt();
        sc.close(); // to prevent any leakage.

        System.out.println();

        // Checking input: should be a positive integer.
        if (endVal <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Number of guesses = Divide the number by 2 until 1 is reached + 1.
        int counter = 0;
        do{
            endVal /= 2; // because this value needs to keep updating.
            counter++;
        } while (endVal > 1);

        counter++; // for the final division when quotient = 0 at 1/2.

        // Print the total number of guesses it would take.
        System.out.printf("Total number of guesses it would take: %d", counter);
        System.out.println();

    }
}
