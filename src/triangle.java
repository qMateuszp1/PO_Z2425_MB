public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double base, double height) throws BadShapeException {
        if (base <= 0 || height <= 0) {
            try {
                throw new
                        BadShapeException("Base and height must be greater than zero.");
            }
            catch (BadShapeException e) {
                System.out.println(e);
            }
            finally {
                System.out.println("Zakonczono obsluge bledow");
            }
            }
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double circumference() {
        // Zakładamy, że obwód trójkąta równobocznego, jako przykładowy obwód,
        // ponieważ obwód trójkąta jest nieokreślony bez znajomości długości pozostałych boków.
        // Aby obliczyć rzeczywisty obwód, potrzebne są długości wszystkich boków trójkąta.
        return 0.0;
    }
}
