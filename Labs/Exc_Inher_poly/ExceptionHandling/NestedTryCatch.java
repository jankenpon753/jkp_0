package Labs.Exc_Inher_poly.ExceptionHandling;

import java.util.*;

public class NestedTryCatch {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = 0;
            int[] arr = new int[10];
            try {
                c = a / b;
                try {
                    arr[12] = c;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                    arr[1] = c;
                    System.out.println(arr[1]);
                }
            } catch (ArithmeticException e) {
                System.out.println(e);
                c = a / (b + 2);
                System.out.println(c);
            }
            System.out.println("rest of the code...");
        }

    }
}
