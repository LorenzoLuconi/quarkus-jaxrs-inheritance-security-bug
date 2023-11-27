package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/test/hello")
          .then()
             .statusCode(403);
    }

    @Test
    public void testBaseHelloEndpoint() {
        given()
                .when().get("/test/baseHello")
                .then()
                .statusCode(403);
    }

}