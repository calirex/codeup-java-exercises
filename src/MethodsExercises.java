//public class MethodsExercises {
//    public static void main(String[] args) {

//  1. Create a class named MethodsExercises. Inside of your class, write code to create the specified methods. Test your code by creating a main method and calling each of the methods you've created.

//        public static int getInteger(int min, int max) {
//                Scanner sc = new Scanner(System.in);
//                int userInput;
//                while (true) {
//                    System.out.print("Enter a number between " + min + " and " + max + ": ");
//                    if (sc.hasNextInt()) {
//                        userInput = sc.nextInt();
//                        if (userInput >= min && userInput <= max) {
//                            break;


//            int a = 10;
//            int b = 5;
//            System.out.println("Addition: " + add(a, b));
//            System.out.println("Subtraction: " + subtract(a, b));
//            System.out.println("Multiplication: " + multiply(a, b));
//            System.out.println("Division: " + divide(a, b));
//            System.out.println("Modulus: " + modulus(a, b));
//        }
//
//        public static int add ( int a, int b){
//            return a + b;
//        }
//
//        public static int subtract ( int a, int b){
//            return a - b;
//        }
//
//        public static int multiply ( int a, int b){
//            return a * b;
//        }
//
//        public static int divide ( int a, int b){
//            return a / b;
//        }
//
//        public static int modulus ( int a, int b){
//            return a % b;

//  2.   Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.

// TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return

////  a greeting message to the user by either their first or first and last name.

//        class Greeting {
//            public static void sayName(String firstName) {
//                System.out.println("Hello " + firstName + ", nice to meet you!");
//            }
//
//            public static void sayName(String firstName, String lastName) {
//                System.out.println("Hello " + firstName + " " + lastName + ", nice to meet you!");
//            }
//
//            public static void main(String[] args) {
//                sayName("Justin");
//                sayName("Justin", "Reich");
//            }
//        }

//// example: sayName("Justin") - "Hi Justin"
//// example: sayName("Justin", "Reich") - "Hi Justin Reich"


//// TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles
//

//                        }
//                    }
//                }