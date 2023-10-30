package carpet_cost_calculator17;
// Class to calculate the total cost of carpeting a floor
public class Calculator {
    private Floor floor;
    private Carpet carpet;
    // Constructor to initialize the floor and carpet objects
    public Calculator (Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    // Method to calculate the total cost of carpeting
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}

