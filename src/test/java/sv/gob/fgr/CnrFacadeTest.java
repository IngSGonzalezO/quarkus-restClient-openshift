package sv.gob.fgr;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;

@QuarkusTest
public class CnrFacadeTest {

    @Test
    public void testDerechoAsientoEndpoint() {
        /*given()
            .when().get("/services/derechoAsiento/201406040273")
            .then()
            .statusCode(200)
            .contentType(ContentType.JSON)
            .body("$.size()", greaterThan(0))
            .body("[0].codigoComunes", notNullValue())
            .body("[0].nombreTitular", notNullValue())
            .body("[0].correlativoNombre", notNullValue())
            .body("[0].derecho", notNullValue());*/
    }

    @Test
    public void testAsientoEndpoint() {
        /*given()
            .when().get("/services/asientos/15172825-00000")
            .then()
            .statusCode(200)
            .contentType(ContentType.JSON)
            .body("$.size()", greaterThan(0))
            .body("[0].correlativoAsiento", notNullValue())
            .body("[0].numeroAsiento", notNullValue())
            .body("[0].clasificacion", notNullValue())
            .body("[0].servicio", notNullValue());*/
    }

}
