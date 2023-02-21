package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    // CONSTRUCTORS //

    protected double length;
    protected double width;

    public Rectangle(int length, int width) {
        super(length, width);
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    public static void main(String[] args) {

        Rectangle newRectangle = new Rectangle(4, 5);
        System.out.printf("""
                Area: %f
                Perimeter: %f
                """, newRectangle.getArea(), newRectangle.getPerimeter());
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }
}
