public class Square extends Shape{
    private double side;
    public Square(double side) {
        if (side <= 0){
            try {
                throw new
                        BadShapeException("side must be greater than zero.");
            }
            catch (BadShapeException e) {
                System.out.println(e);
            }
            finally {
                System.out.println("Zakonczono obsluge bledow");
            }
            }

        this.side = side;

    }
    @Override
    public double area(){
        return side * side;
    }
    @Override
    public double circumference(){
        return 4 * side;
    }
}
