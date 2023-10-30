package java_programmes_4;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class VowelOrConsonant_Programme3{

    public static void main(String[] args){
        VowelOrConsonant_Programme3 obj = new VowelOrConsonant_Programme3();
        obj.m1();
    }

    public static void m1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String userInput = scanner.nextLine();
        //Check if the input is a single character
        if (userInput.length() == 1) {
            char ch = userInput.charAt(0);
            // Check if the character is a letter
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                // Check if it's a vowel - when user enter either lower case or upper case
                if (ch == 'a' && ch == 'A' || ch == 'e' && ch == 'E' || ch == 'i' && ch == 'I' || ch == 'o' && ch == 'O'|| ch == 'u' && ch == 'U') {
                    System.out.print("Input letter is a Vowel");
                } else {
                    System.out.print("Input letter is a Consonant");
                }
            } else {
                //If user enters anything else apart from letter, error must should be thrown
                System.out.print("Error: Input is not a letter (between a and z or A and Z)");
            }
        } else {
            //If user enters more than one character, error message should be thrown
            System.out.print("Error: Input is not a single character.");
        }
        //Closing the scanner
        scanner.close();
    }
}

