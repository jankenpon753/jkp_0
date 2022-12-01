package Labs.Throwing;

public class ExceptionPropagation {
    static void Method1() {
        throw new ArrayIndexOutOfBoundsException("Error in meth 1"); // forcing an error. unchecked, will be caught in
                                                                     // runtime
    }

    static void Method2() {
        Method1(); // calling the funstion with error
    }

    static void Method3() {
        Method2(); // calling the function that's calling the function with error
    }

    public static void main(String[] args) {
        try {
            Method3(); // calling the last method whoch doesn't have the error in it, but is calling
                       // the function that has the error, working through porpagation
        } catch (Exception e) {
            System.out.println(e + " \ncatching from main via method 3 -> 2 -> 1");
        }
    }
}
