package rest.api;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

public class Restcountries {

    @Before
    public void setup() {
        RestAssured.baseURI = "https://restcountries.eu/rest/v2/";
        RestAssured.port = 443;
    }

    @Test
    public void getAllCountries() {
        RestAssured.when().request("GET", "all").then().log().body().statusCode(200);
    }


}
