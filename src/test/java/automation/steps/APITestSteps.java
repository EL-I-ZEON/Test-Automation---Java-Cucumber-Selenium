package automation.steps;

import automation.utils.APIClient;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;

public class APITestSteps {

    private Response response;

    @When("I send a GET request to {string}")
    public void iSendAGETRequestTo(String url) {
        response = APIClient.sendGetRequest(url);
    }

    @When("I send a POST request to {string} with request body")
    public void iSendAPOSTRequestToWithRequestBody(String url, String requestBody) {
        response = APIClient.sendPostRequest(url, requestBody);
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int expectedStatusCode) {
        assertEquals(expectedStatusCode, response.getStatusCode());
    }

    // Add more step definitions for validating response body, headers, etc.
}