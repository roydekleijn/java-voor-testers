package oefeningen;

import org.testng.annotations.Test;

public class PrintVariabele {

    @Test
    public void print() {
        int i = 6;
        double d = 16.55;
        String msg = "Java voor testers";

        System.out.print(i);
        System.out.print(d);
        System.out.print(msg);

        System.out.println(i + " " + d + " " + msg);
    }
}
