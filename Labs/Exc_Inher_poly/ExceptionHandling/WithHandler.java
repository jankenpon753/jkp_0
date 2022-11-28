package Labs.Exc_Inher_poly.ExceptionHandling;

public class WithHandler {

    public static void main(String[] args) {
        int[] arr = new int[10];
        try {
            arr[12] = 12;
            // expected error here, put under try block and used catch later
        } catch (ArrayIndexOutOfBoundsException e) { // specified error type
            System.out.println(e); // printing error message
            arr[3] = 12; // fixing error
            System.out.println(arr[3]);
        }
        System.out.println("rest of the code...");
        // code not in try_catch will run despite the error
    }
}