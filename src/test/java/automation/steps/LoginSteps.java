package automation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

  private WebDriver driver;

  @Given("I am on the login page")
  public void iAmOnTheLoginPage() {
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    driver = new ChromeDriver();
    driver.get("https://example.com/login");
  }

  @When("I enter username {string} and password {string}")
  public void iEnterUsernameAndPassword(String username, String password) {
    driver.findElement(By.id("username")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(password);
    driver.findElement(By.id("login-button")).click();
  }

  @Then("I should be logged in successfully")
  public void iShouldBeLoggedInSuccessfully() {
    String welcomeMessage = driver.findElement(By.id("welcome-message")).getText();
    assertEquals("Welcome, John!", welcomeMessage);
    driver.quit();
  }
}