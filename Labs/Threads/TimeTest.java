package Labs.Threads;

class Student1 extends Thread {
    public void run() {
        for (int i = 0; i < 30; i++) { // printing 30 times, equivalent to 30 mins
            System.out.println("S1 is reading...");
        }
    }
}

class Student2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) { // printing 10 times, equivalent to 30 mins
            System.out.println("S2 is wrtiting------");
        }
    }
}

class Student3 extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) { // printing 20 times, equivalent to 30 mins
            System.out.println("S3 is playing///////");
        }
    }
}

class Student4 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) { // printing 10 times, equivalent to 30 mins
            System.out.println("S4 is gossiping...");
        }
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student2 s2 = new Student2();
        Student3 s3 = new Student3();
        Student4 s4 = new Student4();
        s1.start();
        s2.start();
        try {
            s2.join(); // join method used to make s2 uninterrupted
        } catch (Exception e) {
        }
        s3.start();
        try {
            s3.join(); // same as s2, to make uninterrupted
        } catch (Exception e) {
        }
        s4.start();
    }
}
