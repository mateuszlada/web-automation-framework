package swapi.endpoints.films;

import models.FilmModel;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import swapi.AbstractEndpointTest;

import static constants.Endpoints.FILMS;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetSingleFilmEndpointTest extends AbstractEndpointTest {
    private static final String SCHEMA_FILM = "schemas/filmsSingleSchema.json";
    private static final String FILM_ID = "1";

    @Test
    void when_GetSingleFilm_then_ReturnStatusOK() {
        when().get(FILMS + FILM_ID)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    void when_GetSingleFilm_then_ValidateJsonSchema() {
        when().get(FILMS + FILM_ID)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body(matchesJsonSchemaInClasspath(SCHEMA_FILM));
    }

    @Test
    void when_GetSingleFilm_then_ValidateFilmDataByMatchers() {
        when().get(FILMS + FILM_ID)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body("title", Matchers.equalTo("A New Hope"))
                .body("episode_id", Matchers.equalTo(4))
                .body("opening_crawl", Matchers.startsWith("It is a period of civil war"))
                .body("characters", Matchers.hasSize(18));
    }

    @Test
    void when_GetSingleFilm_then_ValidateFilmDataAsObject() {
        FilmModel responseFilm = get(FILMS + FILM_ID).as(FilmModel.class);

        assertEquals("A New Hope", responseFilm.getTitle());
        assertEquals(4, responseFilm.getEpisode_id());
        assertEquals(18, responseFilm.getCharacters().length);
        assertTrue(responseFilm.getOpening_crawl().startsWith("It is a period of civil war"));
    }
}
