public class Circle extends Shape {
    private Point center;
    private double diameter;

    public Circle(Point center, double diameter) {
        this.center = center;
        this.diameter = diameter;
    }
    @Override
    public double area(){
        double radius = diameter / 2;
        return Math.PI * radius * radius;
    }
    @Override
    public double circumference() {
        return Math.PI * diameter;
    }
}
