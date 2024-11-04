public class Triangle extends Shape{
    private double height;
    private double base;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double area(){
        return 0.5 * base * height;

    }
    @Override
    public double circumference(){
        return 0.0;
    }
}
