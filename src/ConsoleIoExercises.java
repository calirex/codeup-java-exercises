import java.util.Scanner;

public class ConsoleIoExercises {

    public static void main(String[] args) {
//    double pi= 3.14159;
//    String message = String.valueOf(System.out.format("The value of pi is approximately %.2f.", pi));
////   no good //  System.out.printf("The value of pi is approximately %.2f.", pi);
//    System.out.println(message);


//    Scanner sc = new Scanner(System.in);
//    System.out.println("Please enter an integer");
//    int userInt = sc.nextInt();
//    System.out.println(userInt);

//    System.out.println("Please enter three words");
//
//    String word1 = sc.nextLine();
//    String word2 = sc.nextLine();
//    String word3 = sc.nextLine();
////
////    System.out.print(word1 + "\n" + word2 + "\n" + word3);
//    System.out.printf("%s\n%s\n%s", word1, word2, word3);
//
//    System.out.println(word1);
//    System.out.println(word2);
//    System.out.println(word3);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of the classroom: ");
        double length = Double.parseDouble(sc.nextLine());


        System.out.println("Please enter the width of the classroom: ");
        double width = Double.parseDouble(sc.nextLine());

        double perimeter = (length + width) * 2;
        double area = length * width;

        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);



    }
}
