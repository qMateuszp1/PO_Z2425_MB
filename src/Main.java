public class Main {
    public static void main(String[] args) {
        // punkty
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        // kalkulator i obliczenia
        Calculator calc = new Calculator();
        System.out.println("Odległość między p1 i p2: " + calc.distance(p1, p2));
        System.out.println("Odległość w osi X: " + calc.distanceX(p1, p2));
        System.out.println("Odległość w osi Y: " + calc.distanceY(p1, p2));

        // okrag i obliczenia
        Circle circle = new Circle(p1, 10);
        System.out.println("Pole koła: " + circle.area());
        System.out.println("Obwód koła: " + circle.circumference());
    }
}
