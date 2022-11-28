package Labs.Exc_Inher_poly.ExceptionHandling;

import java.util.*;

public class FinallyBlock {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = 0;
            try {
                c = a / b;
            } catch (ArithmeticException e) {
                System.out.println(e);
                c = a / (b + 2);
                System.out.println(c);
            } finally {
                System.out.println("error handled or not i'll work as intended :D");
            }
            System.out.println("rest of the code...");
        }
    }
}
