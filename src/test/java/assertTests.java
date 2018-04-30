import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.offset;

@Test
public class assertTests {


    public void doubleAssert() {
        double getal = 10.0;
        Assertions.assertThat(getal).isCloseTo(4.0, offset(1.0));
    }

    public void stringAssert() {
        String naam = "tester";
        Assertions.assertThat(naam).as("Gebruikersnaam ").endsWith("es");


        int getal = 10;
//        Assertions.assertThat(getal).isCloseTo();
    }

    public void boolAssert() {
        Assertions.assertThat(true).as("is available").isFalse();
    }

    public void intAssert() {
        int getal = 10;
        Assertions.assertThat(getal).isGreaterThan(30);
    }

    public void multipleAsserts() {
        String naam = "tester";
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(naam).as("Gebruikersnaam ").endsWith("es");
        softly.assertThat(naam).as("Gebruikersnaam ").startsWith("rs");

        softly.assertAll();


//        DateTime time = new DateTime().minusDays(2).toDateTime();
//
//        System.out.println(time.toString("dd-MM-yyyy"));

    }


}
