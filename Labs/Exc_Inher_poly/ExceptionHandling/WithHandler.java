package Labs.Exc_Inher_poly.ExceptionHandling;

public class WithHandler {

    public static void main(String[] args) {
        int[] arr = new int[10];
        try {
            arr[12] = 12;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            arr[3] = 12;
            System.out.println(arr[3]);
        }
        System.out.println("rest of the code...");
    }
}