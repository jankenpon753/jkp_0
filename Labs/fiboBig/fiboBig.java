package Labs.fiboBig;

import java.math.BigInteger;
import java.util.*;

public class fiboBig {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int c = input.nextInt();
            BigInteger[] a = new BigInteger[c];
            a[0] = BigInteger.ZERO;
            a[1] = a[2] = BigInteger.ONE;
            System.out.println(a[0]);
            System.out.println(a[1]);
            System.out.println(a[2]);
            for (int i = 3; i < c; i++) {
                a[i] = a[i - 1].add(a[i - 2]).add(a[i - 3]);
                System.out.println(a[i]);
            }
        }
    }
}
