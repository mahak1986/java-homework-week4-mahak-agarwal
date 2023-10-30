package java_programmes_4;
/**
 *
 */

import java.util.Scanner;

public class EvenDigitSum_Programme11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();
        int evenDigitSum = getEvenDigitSum(num1);
        System.out.println("Sum of even digits: " + evenDigitSum);
        scanner.close();
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}


