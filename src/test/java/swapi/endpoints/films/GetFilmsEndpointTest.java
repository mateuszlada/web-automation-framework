package swapi.endpoints.films;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import swapi.AbstractEndpointTest;

import static constants.Endpoints.FILMS;
import static io.restassured.RestAssured.when;

public class GetFilmsEndpointTest extends AbstractEndpointTest {
    @Test
    void when_GetFilms_then_ReturnStatusOK() {
        when().get(FILMS)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    void when_GetFilms_then_ReturnContentTypeJSON() {
        when().get(FILMS)
                .then()
                .contentType(ContentType.JSON);
    }

    @Test
    void when_GetFilms_thenReturnAllFilmsWithTitles() {
        when().get(FILMS)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body("count", Matchers.equalTo(6))
                .body("results.title", Matchers.hasItems(
                        "A New Hope",
                        "Attack of the Clones",
                        "The Phantom Menace",
                        "Revenge of the Sith",
                        "Return of the Jedi",
                        "The Empire Strikes Back"));


    }
}
