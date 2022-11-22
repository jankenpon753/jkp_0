package Labs.PlayerStats;

import java.util.*;

public class StatProg {
    public static void main(String[] args) { // main()
        try (Scanner input = new Scanner(System.in)) {
            String playerName, playerCountry, srcName;
            int playerAge, goalScored, distanceCovered, minsPlayed, plNum, j, t;
            System.out.print("How many palyers?\n-> ");
            plNum = input.nextInt();
            input.nextLine();
            player[] footballer = new player[plNum + 2]; // array of objects
            for (int i = 0; i < plNum; i++) {
                System.out.println();
                System.out.print("Enter name: ");
                playerName = input.nextLine();
                System.out.print("Enter age: ");
                playerAge = input.nextInt();
                input.nextLine();
                System.out.print("Enter country: ");
                playerCountry = input.nextLine();
                footballer[i] = new player(playerName, playerAge, playerCountry); // new object initializatiopn with constructor
            }
            System.out.println();
            System.out.print("Add info? (1 = Yes, 0 = No)\n-> ");
            t=input.nextInt();
            input.nextLine();
            while (t == 1) {
                System.out.println();
                System.out.print("Enter player to add info: ");
                srcName = input.nextLine();
                for (j = 0; j < plNum; j++) {
                    if (footballer[j].srcName().equals(srcName)) {
                        break;
                    }
                }
                System.out.print("Enter goals: ");
                goalScored = input.nextInt();
                System.out.print("Enter distance: ");
                distanceCovered = input.nextInt();
                System.out.print("Enter minuites played: ");
                minsPlayed = input.nextInt();
                input.nextLine();
                footballer[j].addMatch(goalScored, distanceCovered, minsPlayed);
                System.out.println();
                System.out.print("Add more info? (1 = Yes, 0 = No)\n-> ");
                t = input.nextInt();
                input.nextLine();
            }
            for (int i = 0; i < plNum; i++) {
                System.out.println();
                footballer[i].showInfo();
            }
        }
    }
}
