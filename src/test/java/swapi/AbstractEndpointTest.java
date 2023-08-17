package swapi;

import constants.Properties;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public abstract class AbstractEndpointTest {
    @BeforeAll
    public static void abstractSetUp() {
        RestAssured.baseURI = Properties.BASE_URI;
    }
}