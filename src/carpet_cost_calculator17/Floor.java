package carpet_cost_calculator17;
// Class to represent the dimensions of a floor
public class Floor {
    private double width;
    private double length;
    // Constructor to initialize the width and length of the floor
    public Floor(double width,double length){
        // Ensure that negative values are set to 0
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }
    // Method to calculate the area of the floor
    public double getArea(){
        return width * length;
    }
}
