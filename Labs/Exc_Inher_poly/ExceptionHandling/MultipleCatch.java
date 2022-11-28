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
                c = a / b;
                arr[12] = c;
            } catch (ArithmeticException e) {
                System.out.println(e);
                c = a / (b + 2);
                System.out.println(c);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                arr[1] = c;
                System.out.println(arr[1]);
            }
            System.out.println("rest of the code...");
        }
    }
}
