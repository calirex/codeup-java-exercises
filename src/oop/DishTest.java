package oop;

import java.io.PrintStream;

public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.setCostInCents(1599);
        dish1.setNameOfDish("Steak Special");
        dish1.setWouldRecommend(true);

        Dish dish2 = new Dish();
        dish2.setCostInCents(100);
        dish2.setNameOfDish("Oysters");
        dish2.setWouldRecommend(true);

        Dish dish3 = new Dish();
        dish3.setCostInCents(300);
        dish3.setNameOfDish("Beer");
        dish3.setWouldRecommend(true);

        dish1.printSummary(dish1);
        dish2.printSummary(dish2);
        dish3.printSummary(dish3);




    }
}
