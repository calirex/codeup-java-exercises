package utils;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    // CONSTRUCTORS //
    public Input() {
        this.scanner = new Scanner(System.in);

    }

    // METHODS //
    public String getString() {
        System.out.println("Enter a string: ");
        return scanner.nextLine();

    }

    public Boolean yesNo() {
        System.out.println("Continue: [y/n]");
        String input = null;
        String inputLowered = input.toLowerCase();
        return inputLowered.equals("y") || inputLowered.equals("yes");

    }

    public int getInt(int min, int max) {
        System.out.printf("Pick a Number between %s and %s", min, max);
        int userNumber = scanner.nextInt();
        if (userNumber > max || userNumber < min) {
            getInt();
        } else {
            System.out.printf("Thanks %s is between %s and %s", userNumber, min, max);
        }
        return userNumber;
    }

    public int getInt() {
        System.out.println("Enter a number: ");
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f", min, max);
        double userNumber = this.scanner.nextDouble();
        if (userNumber > max || userNumber < min) {
            getDouble(min, max);
        } else {
            System.out.println(userNumber);
        }
        return userNumber;
    }

    public double getDouble() {
        System.out.println("Enter a double: ");
        return this.scanner.nextDouble();
    }

}
