package abstractexample21;

class TestAbstraction {
    public static void main(String[] args) {
        Shape s = new Circle1(); // In a real scenario, the object is provided through a method, e.g., getShape() method
        s.draw();
    }
}


