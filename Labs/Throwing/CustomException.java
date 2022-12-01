package Labs.Throwing;

import java.util.Scanner;

class AgeCheckerException extends Exception {
    public AgeCheckerException(String str) {
        super(str);
    }
}

public class CustomException {
    static void Validate(int age) throws AgeCheckerException {
        if (age < 18) {
            throw new AgeCheckerException("Underage");
        } else {
            System.out.println("Person is an adult");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int age = input.nextInt();
            try {
                Validate(age);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
