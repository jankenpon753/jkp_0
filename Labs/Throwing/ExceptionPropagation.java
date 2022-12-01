package Labs.Throwing;

public class ExceptionPropagation {
    static void Method1() {
        throw new ArrayIndexOutOfBoundsException("Error in meth 1");
    }

    static void Method2() {
        Method1();
    }

    static void Method3() {
        Method2();
    }

    public static void main(String[] args) {
        try {
            Method3();
        } catch (Exception e) {
            System.out.println(e + " \ncatching from main via method 3 -> 2 -> 1");
        }
    }
}
