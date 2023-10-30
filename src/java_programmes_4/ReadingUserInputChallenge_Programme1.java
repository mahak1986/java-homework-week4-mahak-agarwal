package java_programmes_4;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge
 */
public class ReadingUserInputChallenge_Programme1 {

    public static void hasNextInt() {
        //create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        //Use a while loop to continue reading numbers until we have read 10 valid integers
        //Inside the loop, we use hasNextInt() to check if the next input is an integer.
        while (count < 10) {
            System.out.print("Enter number #" + (count + 1) + " : ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                //If it is, we use nextInt() to get the integer value and add it to the sum.
                // We also increment the count
                sum += number;
                count++;
            } else {
                //If the input is not a valid integer,
                // we print "Invalid Number" and use scanner.next() to clear the invalid input.
                System.out.println("Invalid Number. Please enter a valid integer.");
                scanner.nextInt();
            }
        }
        //close the Scanner when we are done
        scanner.close();
    }

    public static void main(String[] args) {
        //Calling static method into the main method
        hasNextInt();
    }
}
