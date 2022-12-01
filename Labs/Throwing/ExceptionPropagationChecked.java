package Labs.Throwing;

import java.io.IOException;

public class ExceptionPropagationChecked {
    static void Method1() throws IOException {
        throw new IOException("Checked error");
    }

    static void Method2() throws IOException {
        Method1();
    }

    static void Method3() throws IOException {
        Method2();
    }

    public static void main(String[] args) {
        try {
            Method1();
        } catch (Exception e) {
            System.out.println(e + " \ncatching using throw_throws");
        }
    }
}
