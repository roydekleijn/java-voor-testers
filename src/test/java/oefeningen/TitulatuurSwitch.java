package oefeningen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TitulatuurSwitch {

    @Test
    public void switchTitle() {
        String titleAbbreviation = "ing";
        String fullTitle = "";

        switch (titleAbbreviation) {
            case "dr": {
                fullTitle = "doctor";
                break;
            }
            case "ing": {
                fullTitle = "ingenieur";
                break;
            }
            default: {
                fullTitle = "Geen keuze gemaakt";
            }
        }

        System.out.println(fullTitle);
        Assert.assertEquals(fullTitle, "doctor");
    }
}
