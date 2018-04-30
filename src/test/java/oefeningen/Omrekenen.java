package oefeningen;

import org.testng.annotations.Test;

public class Omrekenen {

    @Test
    public void celciusToFahrenheit() {
        double celcius = 20.0;

        double fahrenheit = (celcius * 1.8) + 32;

        System.out.println(fahrenheit);
    }

    @Test
    public void fahrenheitToCelcius() {
        double fahrenheit = 15.5;

        double celcius = (fahrenheit - 32) / 1.8;

        System.out.println(fahrenheit);

    }
}
