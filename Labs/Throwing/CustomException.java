package Labs.Throwing;

import java.util.Scanner;

class AgeCheckerException extends Exception { // creating a custom error extending the parent class Exception
    public AgeCheckerException(String str) { // constructor of the custom error class
        super(str); // calling parent class's constructor with param
    }
}

public class CustomException {
    static void Validate(int age) throws AgeCheckerException { // function to use the custom error type
        if (age < 18) {
            throw new AgeCheckerException("Underage, not eligible for voting"); // throwing the custom error if the if
                                                                                // condition is true
        } else {
            System.out.println("Person is an adult, eligible for");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int age = input.nextInt();
            try {
                Validate(age); // calling function that might throw the custom error if condition is met
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
