/**
 * @Author:Otosun Tarih :10/10/2020
 */
package StepDefinitions;

import Pages.DialogContent;
import Pages._Parent;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderHistory {
    WebDriver driver;
    DialogContent dialogContent = new DialogContent();

    @Given("^Navigate to Order History$")
    public void navigateToSpecials() {
        dialogContent.findElementAndClickFunction("orders");
    }

    @When("^On the order \"([^\"]*)\" list, verify that the order number is \"([^\"]*)\"$")
    public void onTheOrderListVerifyThatTheOrderNumberIs(String arg0, String arg1) {
        dialogContent.findElementListAndNumberOfLstOrPrintItemsOfList(arg0,Integer.parseInt(arg1));
    }

    @Then("^Order list \"([^\"]*)\"$")
    public void orderList(String arg0){
        dialogContent.findElementListAndNumberOfLstOrPrintItemsOfList(arg0,Integer.parseInt("0"));
    }


    @And("^Print the names of the products in the orders \"([^\"]*)\"$")
    public void printTheNamesOfTheProductsInTheOrders(String arg0) {
        dialogContent.findWebElementListAndClickEachOneElementWithForeachAndPrintOfList(arg0,"productNameList");

    }
}

