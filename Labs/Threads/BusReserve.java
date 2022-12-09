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
            Random rn = new Random(); // to create random seat number
            int seat, cust, s;
            s = input.nextInt(); // total number of seats
            cust = input.nextInt(); // total number of customers
            for (int i = 0; i < cust; i++) {
                seat = rn.nextInt(s); // creating random seat number for a customer
                if (i < s) {
                    BusRes t1 = new BusRes(seat, i); // sending seat number and customer number to thread class and
                                                     // creating thread object
                    t1.start();
                    try {
                        t1.join(); // using join so that all the threads run serially, as 1 > 2 > 3 >...
                    } catch (Exception e) {
                    }
                } else {
                    System.out.println("Cusotmer #" + i + " failed to buy a ticket. Sold out"); // printing error
                                                                                                // message in case
                                                                                                // customer is out of
                                                                                                // queue
                }
            }

        }

    }

}
