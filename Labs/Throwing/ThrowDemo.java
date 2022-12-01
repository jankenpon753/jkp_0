package Labs.Throwing;

public class ThrowDemo {

    public static void main(String[] args) {
        try {
            throw new ArithmeticException("heres the error");
        } catch (Exception e) {
            System.out.println(e + " caught part");
        }
    }
}