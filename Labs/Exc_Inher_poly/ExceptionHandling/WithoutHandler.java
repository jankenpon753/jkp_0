package Labs.Exc_Inher_poly.ExceptionHandling;

public class WithoutHandler {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[12] = 12;
        // expected error here as its trying to access 11th index of an array of size 10
        System.out.println("rest of the code...");
        // code after error line, will not run after the error is faced by the compiler
    }

}