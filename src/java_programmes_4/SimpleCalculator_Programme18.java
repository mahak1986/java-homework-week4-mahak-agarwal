package java_programmes_4;

/**
 * Sum Calculator
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the
 * firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value
 * of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 * value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 * TEST EXAMPLE
 * TEST CODE: Write the bellow code into main method
 * SimpleCalculator calculator = new SimpleCalculator();
 * calculator.setFirstNumber(5.0);
 * calculator.setSecondNumber(4);
 * PRIME TESTING
 * System.out.println("add= " + calculator.getAdditionResult());
 * System.out.println("subtract= " + calculator.getSubtractionResult());
 * calculator.setFirstNumber(5.25);
 * calculator.setSecondNumber(0);
 * System.out.println("multiply= " + calculator.getMultiplicationResult());
 * System.out.println("divide= " + calculator.getDivisionResult());
 * OUTPUT
 * add= 9.0
 * subtract= 1.0
 * multiply= 0.0
 * divide= 0.0
 * TIPS:
 * ● add= 9.0 is printed because 5.0 + 4 is 9.0
 * ● subtract= 1.0 is printed because 5.0 - 4 is 1.0
 * ● multiply= 0.0 is printed because 5.25 * 0 is 0.0
 * ● divide= 0.0 is printed because secondNumber is set to 0
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 8 methods.
 */

public class SimpleCalculator_Programme18 {
    // Declare instance variables to store the numbers
    private double firstNumber;
    private double secondNumber;
    // Getter method for retrieving the value of the firstNumber
    public double getFirstNumber() {
        return firstNumber;
    }
    // Getter method for retrieving the value of the secondNumber
    public double getSecondNumber() {
        return secondNumber;
    }
    // Setter method for setting the value of the firstNumber
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    // Setter method for setting the value of the secondNumber
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    // Method to calculate and return the subtraction result of the two numbers
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }
    // Method to calculate and return the subtraction result of the two numbers
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }
    // Method to calculate and return the multiplication result of the two numbers

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }
    // Method to calculate and return the division result of the two numbers
    // If the secondNumber is 0, it returns 0 to handle division by zero
    public double getDivisionResult() {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the SimpleCalculator class
        SimpleCalculator_Programme18 calculator = new SimpleCalculator_Programme18();
        // Set values for the first and second numbers
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        // Calculate and print the addition result
        System.out.println("add= " + calculator.getAdditionResult());
        // Calculate and print the subtraction result
        System.out.println("subtract= " + calculator.getSubtractionResult());
        // Set new values for the first and second numbers
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        // Calculate and print the multiplication result
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        // Calculate and print the division result
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
