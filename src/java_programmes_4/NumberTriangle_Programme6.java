package java_programmes_4;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number using scanner and for loop
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class NumberTriangle_Programme6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int numRows = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1); // Add 1 to start with 1 instead of 0
            }
            System.out.println();
        }
    }
}
