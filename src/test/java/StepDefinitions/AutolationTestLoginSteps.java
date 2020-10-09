package StepDefinitions;

import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * @Author:Otosun Tarih :09/10/2020
 */


public class AutolationTestLoginSteps {
    WebDriver driver;

    @Given("^Navigate to automationpractice$")
    public void navigateToAutomationpractice() {
        driver = Driver.getDriver();
        driver.get(" http://automationpractice.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    @When("^Enter username and password,  click Login button$")
    public void enterUsernameAndPasswordClickLoginButton() {

    }

    @Then("^User should  login successfully$")
    public void userShouldLoginSuccessfully() {


    }
}
