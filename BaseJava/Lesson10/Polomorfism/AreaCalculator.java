package BaseJava.Lesson10.Polomorfism;

public class AreaCalculator {
    public static void main(String[] args) {
        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(4, 5);

        int squareArea = square.calculateArea();
        int rectangleArea = rectangle.calculateArea();

        System.out.println("Square area: " + squareArea + " sq.cm");
        System.out.println("Rectangle area: " + rectangleArea + " sq.cm");
    }
}
