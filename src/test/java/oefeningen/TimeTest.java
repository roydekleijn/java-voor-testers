package oefeningen;

import org.assertj.core.api.Assertions;
import org.joda.time.DateTime;
import org.testng.annotations.Test;

public class TimeTest {

    @Test
    public void calcDate() {
        Assertions.assertThat("").as("").contains("");
        System.out.println(new DateTime().minusDays(3).toString());
    }
}
