package java_programmes_4;
/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */

import java.util.Scanner;

public class Diamond_Programme14 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of rows for the diamond pattern: ");
    int rows = scanner.nextInt();

    int spaces = rows - 1;
    int stars = 1;

    // Upper half of the diamond
    int i = 1;
    while (i <= rows) {
        // Print spaces
        int j = 1;
        while (j <= spaces) {
            System.out.print(" ");
            j++;
        }

        // Print stars
        int k = 1;
        while (k <= stars) {
            System.out.print("*");
            k++;
        }

        // Move to the next row
        System.out.println();

        spaces--;
        stars += 2;
        i++;
    }

    // Lower half of the diamond
    spaces = 1;
    stars = rows * 2 - 3;
    i = 1;
    while (i <= rows - 1) {
        // Print spaces
        int j = 1;
        while (j <= spaces) {
            System.out.print(" ");
            j++;
        }

        // Print stars
        int k = 1;
        while (k <= stars) {
            System.out.print("*");
            k++;
        }

        // Move to the next row
        System.out.println();

        spaces++;
        stars -= 2;
        i++;
    }
    scanner.close();//Closing the scanner after use
}
}
