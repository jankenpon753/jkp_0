package Labs.PlayerStats;

public class player {
    private String playerName, playerCountry;
    private int playerAge, goalScored, distanceCovered, minsPlayed, match;
    private double avgGoal, avgSpeed, avgDistance;

    public player(String playerName, int playerAge, String playerCountry) { // constructor
        this.match = this.goalScored = this.distanceCovered = this.minsPlayed = 0;
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerCountry = playerCountry;
    }

    public String srcName() { // to search for player later
        return playerName;
    }

    public void addMatch(int goalScored, int distanceCovered, int minsPlayed) { // to add info
        this.match++;
        this.goalScored += goalScored;
        this.distanceCovered += distanceCovered;
        this.minsPlayed += minsPlayed;
    }

    public void showInfo() { // to show info
        System.out.println("Name: " + playerName);
        System.out.println("Age: " + playerAge);
        System.out.println("Country: " + playerCountry);
        System.out.println("Matches played: " + match);
        System.out.println("Goals Scored: " + goalScored);
        System.out.println("Disctance Covered: " + distanceCovered);
        System.out.println("Minuites Played: " + minsPlayed);
        avgStat();
        System.out.println("Average Goal: " + avgGoal);
        System.out.println("Average Speed: " + avgSpeed);
        System.out.println("Average Distance Covered: " + avgDistance);
    }

    public void avgStat() { // to find and store calculated values
        avgGoal = (float) goalScored / match;
        avgSpeed = (float) distanceCovered / minsPlayed;
        avgDistance = (float) distanceCovered / match;
    }

}
