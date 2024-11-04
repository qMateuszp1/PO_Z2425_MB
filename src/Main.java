public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(0, 0),10 );
        Square square = new Square(5);
        Triangle triangle = new Triangle(6, 8);

        Calculator calc = new Calculator();
        System.out.println("Suma powierzchni koła i kwadratu: " + calc.calculateAreaSum(circle, square));
        System.out.println("Suma powierzchni trojkata i kwadratu: " + calc.calculateAreaSum(triangle, square));
        System.out.println("Suma powierzchni koła i trojkata: " + calc.calculateAreaSum(circle, triangle));
    }
}
