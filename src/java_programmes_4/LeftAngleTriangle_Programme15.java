package java_programmes_4;
/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

import java.util.Scanner;

public class LeftAngleTriangle_Programme15 {
    public static void main(String[] args) {
        LeftAngleTriangle_Programme15 obj = new LeftAngleTriangle_Programme15();
        obj.m1();
    }
    public void m1() {
        Scanner scanner = new Scanner(System.in);
        //user to enter the number of rows for the triangle
        System.out.println("Enter number of rows for the triangle: ");
        int rows = scanner.nextInt();
        //use nested for loops to print asterisks in the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();// Move to the next line after each row
        }
        scanner.close();//scanner close
    }
}
