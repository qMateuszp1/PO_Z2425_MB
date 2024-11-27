public class Circle extends Shape {
    private Point center;
    private double diameter;

    public Circle(Point center, double diameter) throws BadShapeException {
        if (diameter <= 0) {
            try {
                throw new BadShapeException("średnica musi byc wieksza od 0.");
            }
            catch (BadShapeException e) {
                System.out.println(e);
            }
            finally {
                System.out.println("Zakonczono obsluge bledow");
            }
            }
        this.center = center;
        this.diameter = diameter;
    }

    @Override
    public double area() {
        double radius = diameter / 2;
        return Math.PI * radius * radius;
    }

    @Override
    public double circumference() {
        return Math.PI * diameter;
    }
}
