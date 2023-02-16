package shapes;

import utils.Input;

public class CircleApps {

    // VIEWPORT //
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Please enter a radius to create a circle");
        double userRadius = input.getDouble();
        Circle circle = new Circle(userRadius);
        System.out.printf("""
                the circumfrence is %.3f
                the area is %.2f
                """, circle.getCircumference(), circle.getArea());
    }



}
