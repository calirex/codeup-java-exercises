package oop;

import java.io.PrintStream;

public class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish(1599, "steak Special", true);

        Dish dish2 = new Dish("Oysters");

        Dish dish3 = new Dish(300, "Beer");

        dish1.printSummary(dish1);
        dish2.printSummary(dish2);
        dish3.printSummary(dish3);

        dish2.setCostInCents(100);
        dish2.printSummary(dish2);



    }
}
