package Labs.Threads;

import java.util.*;

class UserInput extends Thread { // creating a thread by extending thread class
    String s;

    public UserInput(String s) {
        this.s = s;
    }

    public void run() { // run() method, that will work automatically with start() call
        for (int i = 0; i < 100; i++) {
            System.out.println(this.s);
        }
    }
}

class MssgPrnt extends Thread { // creating a second thread by extending thread class
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Hello thread");
        }
    }
}

class SumPrnt extends Thread {// creating a third thread by extending thread class
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
            UserInput t1 = new UserInput(a); // creating thread objects
            MssgPrnt t2 = new MssgPrnt();
            SumPrnt t3 = new SumPrnt();
            t1.start(); // running the 3 threads, all will run simultaneously
            t2.start();
            t3.start();
        }
    }
}
