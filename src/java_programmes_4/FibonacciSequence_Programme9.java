package java_programmes_4;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class FibonacciSequence_Programme9 {
    public static void main(String[] args) {
        FibonacciSequence_Programme9 obj = new FibonacciSequence_Programme9();
        obj.isFibonacciNumber();
    }
    public void isFibonacciNumber(){
        Scanner scanner= new Scanner(System.in);//Scanner declaration for user input
        System.out.println("Enter the Fibonacci number: ");
        int fibonacciNumber = scanner.nextInt();
        int num1 = 0; //Initialize the first fibonacci sequence
        int num2 = 1; //Initialize the second fibonacci number
        int num3; // Declare a variable to store the next number
        System.out.print(num1 + " " + num2); //Print the first two terms
        for (int i = 2; i < fibonacciNumber; i++) {
            num3 = num1 +num2; //Calculating the next number by adding the previous two numbers
            System.out.println(" " +num3); //print the next number
            num1 = num2;
            num2= num3;
        }
        scanner.close();//Scanner closed
    }
}
