public class Circle {
    private Point center;
    private double diameter;


    public Circle(Point center, double diameter) {
        this.center = center;
        this.diameter = diameter;
    }

    // pole kola
    public double area() {
        double radius = diameter / 2;
        return Math.PI * radius * radius;
    }

    // oobwod kola
    public double circumference() {
        return Math.PI * diameter;
    }
}
