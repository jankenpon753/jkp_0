package Labs.Threads;

import java.util.*;

class BusRes extends Thread {
    int seat, cust;

    public BusRes(int seat, int cust) {
        this.seat = seat;
        this.cust = cust;
    }

    public void run() {
        System.out.println("Customer #" + cust + " bought #" + seat + " seat successfully");
    }
}

public class BusReserve {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random rn = new Random();
            int seat, cust, s;
            s = input.nextInt();
            cust = input.nextInt();
            for (int i = 0; i < cust; i++) {
                seat = rn.nextInt(s);
                if (i < s) {
                    BusRes t1 = new BusRes(seat, i);
                    t1.start();
                    try {
                        t1.join();
                    } catch (Exception e) {
                    }
                } else {
                    System.out.println("Cusotmer #" + i + " failed to buy a ticket. Sold out");
                }
            }

        }

    }

}
