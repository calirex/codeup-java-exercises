package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        //VIEWPORT //
        Measurable mySquare = new Square(5);
        Measurable myRectangle = new Rectangle(5, 4);

        System.out.printf("""
                The perimeter of your rectangle is: %.0f
                """, myRectangle.getPerimeter());
        System.out.printf("""
                The area of your rectangle is: %.0f
                """, myRectangle.getArea());
        System.out.printf("""
                The perimeter of your square is: %.0f
                """, mySquare.getPerimeter());
        System.out.printf("""
                The area of your square is: %.0f
                """, mySquare.getArea());
    }


}
