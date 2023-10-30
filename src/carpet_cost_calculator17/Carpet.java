package carpet_cost_calculator17;
// Class to represent the cost of a carpet
public class Carpet {
    private double cost;
    // Constructor to initialize the cost of the carpet
    public Carpet(double cost){
        this.cost = (cost < 0) ? 0 : cost;
    }
    // Method to get the cost of the carpet
    public double getCost() {
        return cost;
    }
}

