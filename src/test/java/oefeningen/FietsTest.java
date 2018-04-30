package oefeningen;

import org.testng.annotations.Test;

public class FietsTest {

    @Test
    public void rideABike() {
        Fiets gazelle = new Fiets(10, 2);

        gazelle.versnellen(10);


        System.out.println(gazelle.getSnelheid());


        gazelle.remmen(5);

        System.out.println(gazelle.getSnelheid());

    }
}
