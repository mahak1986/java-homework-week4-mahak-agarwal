package java_programmes_4;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class ArmStrongNumber_Programme10 {
    public static void main(String[] args) {
        ArmStrongNumber_Programme10 obj = new ArmStrongNumber_Programme10();
        obj.isArmstrong();
    }

    public void isArmstrong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int cube=0,remainder,check;
        int n=scanner.nextInt();
        check=n;
        int original = n;
        while (n>0){
            remainder = n%10;
            n = n/10;
            cube = cube + (remainder * remainder * remainder);
        }
        if (check==cube)
            System.out.println(original+ " is an Armstrong number");
        else
            System.out.println(original+ " is not an Armstrong Number");
        scanner.close();//closing the scanner
    }

}






