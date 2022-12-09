package Labs.Threads;

import java.util.*;

class UserInput extends Thread {
    String s;

    public UserInput(String s) {
        this.s = s;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.s);
        }
    }
}

class MssgPrnt extends Thread {
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Hello thread");
        }
    }
}

class SumPrnt extends Thread {
    int sum = 0;

    public void run() {
        for (int i = 0; i < 200; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}

public class BasicThreadOp {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String a = input.nextLine();
            UserInput t1 = new UserInput(a);
            MssgPrnt t2 = new MssgPrnt();
            SumPrnt t3 = new SumPrnt();
            t1.start();
            t2.start();
            t3.start();
        }
    }
}
