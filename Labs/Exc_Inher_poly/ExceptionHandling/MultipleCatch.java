package Labs.Exc_Inher_poly.ExceptionHandling;

import java.util.*;

public class MultipleCatch {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = 0;
            int[] arr = new int[10];
            try {
                c = a / b; // potential error 1
                arr[12] = c; // potential error 2
            } catch (ArithmeticException e) { // specified catch for error 1
                System.out.println(e);
                c = a / (b + 2);
                System.out.println(c);
            } catch (ArrayIndexOutOfBoundsException e) { // specified catch for error 2
                System.out.println(e);
                arr[1] = c;
                System.out.println(arr[1]);
            }
            // which catch will be effective will depend on the type of exception that
            // occurs
            System.out.println("rest of the code...");
        }
    }
}
