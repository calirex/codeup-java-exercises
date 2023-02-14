package oop;

import java.io.PrintStream;

public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 1599;
        dish1.nameOfDish = "Steak Special";
        dish1.wouldRecommend = true;

        Dish dish2 = new Dish();
        dish2.costInCents = 100;
        dish2.nameOfDish = "Oysters";
        dish2.wouldRecommend = true;

        Dish dish3 = new Dish();
        dish3.costInCents = 300;
        dish3.nameOfDish = "Beer";
        dish3.wouldRecommend = true;

        dish1.printSummary(dish1);
        dish2.printSummary(dish2);
        dish3.printSummary(dish3);



    }
}
