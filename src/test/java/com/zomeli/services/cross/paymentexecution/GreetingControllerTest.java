package com.zomeli.services.cross.paymentexecution;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GreetingControllerTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/transfer")
          .then()
             .statusCode(200)
             .body(is("Hello from RESTEasy Reactive"));
    }

}