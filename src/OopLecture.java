//public class OopLecture {
//    public static void main(String[] args) {

//        -- OOP SHORT ASSIGNMENT #1 --
//        Create a class called Dish. This class will represent various restaurant dishes.
//        Include an integer property called “costInCents”
//        Include a string property called “nameOfDish”
//        Include a boolean property called “wouldRecommend”
//        Include a method called “printSummary” with a void return type
//        this method will use a single printf method to print out the values of each of the instance properties in the following format:
//        Cost: COST_IN_CENTS_HERE
//        Name: NAME_OF_DISH_HERE
//        Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
//        Create another class called DishTest
//                Add a main method and inside the method...
//        1) instantiate a Dish object and assign to a variable called dish1
//        2) assign creative values for each of the properties
//        3) test the printSummary() method by invoking it and checking if all instance values are correctly printed
//





//        SHORT ASSIGNMENT #2 //
//        Create a class of static members (variables and methods) called DishTools
//        - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 1300
//                - shoutDishName() - that takes in a Dish object and prints out the name in all caps
//                - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
//                - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
//        Try out the DishTools methods with Dish objects in the DishTest main method
//        BONUS - add some static methods to the Dish class that compares two dishes in some way








//package oop;

//import java.util.Date;
//
//        public class Post {

    /*
      int id
      String title
      String content
      String author
      Date created_at
     */

//            public int id;
//            public String title;
//            public String content;
//            public String author;
//            public Date created_at;
//
//            public String returnAuthorDateMessage() {
//                return String.format("This post was created by %s on %s", author, created_at);
//            }

//    @Override
//    public String toString() {
//        return "Post{" +
//            "id=" + id +
//            ", title='" + title + '\'' +
//            ", content='" + content + '\'' +
//            ", author='" + author + '\'' +
//            ", created_at=" + created_at +
//            '}';
//    }



//            public static void main(String[] args) {
//                Post post1 = new Post();
//                post1.id = 1;
//                post1.title = "Day in the Life";
//                post1.content = "It happens every day...";
//                post1.author = "Overlord";
//                post1.created_at = new Date();
//
//                Post post2 = new Post();
//                post2.id = 2;
//                post2.title = "A Day";
//                post2.content = "It happens...";
//                post2.author = "Mr. Overlord";
//                post2.created_at = new Date();
//
//
//                System.out.println(post1.returnAuthorDateMessage());
//                System.out.println(post2.returnAuthorDateMessage());
//
////        System.out.println(post1);
////
////        System.out.println(post1.title);
////        Post p = post1;
////        p.title = "LOL";
////        System.out.println(post1.title);
////
////
////        System.out.println(p);
//
////        System.out.println(post2);
//
//            }
//
//
//        }
























//        ================================= OOP INTRO

//        -- UP TO NOW --
//
//                - using functions/methods to group together steps for a program to work
//
//
//        -- DEFINITION --
//
//        OOP - Object-oriented programming
//
//                - A programming paradigm where state (data/properties) and behavior (functionality/methods)
//        are grouped together (often into objects)
//                - Objects in Java are created from classes (a blueprint for an object/instance)
//
//
//        -- ADVANTAGES OF OOP --
//
//                Programming in an Object-oriented way can be used to develop code with a clearer and more modular organization in the following ways:
//
//        - implementation details can be abstracted away making code more readable (Abstraction)
//                - restriction of access to various levels of abstraction preventing data inconsistencies (Encapsulation)
//                - duplication is minimized through inheritance hierarchies (Inheritance)
//                - flexible code where multiple implementations may be swapped out behind a common interface (Polymorphism)
//
//
//                -- THE FOUR PILLARS OF OOP --
//
//        1. Abstraction - keep it clean
//        2. Encapsulation - keep it contained
//        3. Inheritance - keep it DRY
//        4. Polymorphism - keep it versatile
//
//        https://medium.com/@hamzzza.ahmed95/four-pillars-of-object-oriented-programming-oop-e8d7822aa219
//
//        Today we will focus on Abstraction and Encapsulation.
//
//
//        -- CONCEPTS COVERED --
//
//                - how to create custom classes and objects from these classes
//                - defining and using instance and static fields
//        - how to control class constructors
//        - using the "this" keyword
//                - controlling encapsulation with visibility modifiers











//    }
//}
