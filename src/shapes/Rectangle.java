package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

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
}
