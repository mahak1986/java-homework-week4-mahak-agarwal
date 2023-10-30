package java_programmes_4;
/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge_Programme2 {

    public static void main(String[] args) {
    //Calling instance method into the main method via object
        MinAndMaxInputChallenge_Programme2 obj = new MinAndMaxInputChallenge_Programme2();
        obj.m1();
    }

    public void m1() {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        while (true) {
            System.out.println("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                break;
            }
            // Consume the newline character
            scanner.nextLine();
        }
        //Printing min and max numbers
        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);
        //Closing the scanner
        scanner.close();
    }
}
