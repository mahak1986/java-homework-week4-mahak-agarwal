package carpet_cost_calculator17;
// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create a carpet object with a cost of 3.5 per square meter
        Carpet carpet = new Carpet(3.5);
        // Create a floor object with dimensions 2.75 meters in width and 4.0 meters in length
        Floor floor = new Floor(2.75,4.0);
        // Create a calculator object with the floor and carpet objects
        Calculator calculator = new Calculator(floor,carpet);
        // Calculate and print the total cost of carpeting the floor
        System.out.println("Total= " + calculator.getTotalCost());
        // Create another carpet object with a cost of 1.5 per square meter
        carpet = new Carpet(1.5);
        // Create another floor object with dimensions 5.4 meters in width and 4.5 meters in length
        floor = new Floor(5.4,4.5);
        // Create a new calculator object with the new floor and carpet objects
        calculator = new Calculator(floor,carpet);
        // Calculate and print the total cost of carpeting the second floor
        System.out.println("Total= " + calculator.getTotalCost());

    }
}
