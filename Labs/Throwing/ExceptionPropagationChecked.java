package Labs.Throwing;

import java.io.IOException;

public class ExceptionPropagationChecked {
    static void Method1() throws IOException {
        throw new IOException("Checked error"); // throwing error. cheked, will be caught in compile-time
    }

    static void Method2() throws IOException { // using throws to catch it, if its not used, it'll show compilation
                                               // error
        Method1();
    }

    static void Method3() throws IOException { // same as method 2's comment
        Method2();
    }

    public static void main(String[] args) {
        try {
            Method3(); // calling via propagation the function that has the checked error
        } catch (Exception e) {
            System.out.println(e + " \ncatching using throw_throws");
        }
    }
}
