/**
 * @Author:Otosun Tarih :10/10/2020
 */
package StepDefinitions;

import Pages.DialogContent;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class OrderHistory {
    WebDriver driver;
    DialogContent dialogContent = new DialogContent();

    @Given("^Navigate to Order History$")
    public void navigateToSpecials() {
        dialogContent.findElementAndClickFunction("orders");
    }

}
