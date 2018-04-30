package oefeningen;

import org.testng.annotations.Test;

public class ScoreBoard {

    @Test
    public void printScore() {
        int score = 101;

        if (score > 99) {
            System.out.println("perfect !");
        } else if (score > 65) {
            System.out.println("je bent geslaagd");
        } else if (score <= 65) {
            System.out.println("Je bent gezakt");
        }
    }
}
