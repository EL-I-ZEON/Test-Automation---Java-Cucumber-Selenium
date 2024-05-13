package automation.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIClient {

    public static Response sendGetRequest(String url) {
        return RestAssured.get(url);
    }

    public static Response sendPostRequest(String url, Object requestBody) {
        return RestAssured.given().body(requestBody).post(url);
    }

    // Add methods for other HTTP methods (PUT, DELETE, etc.) as needed
}