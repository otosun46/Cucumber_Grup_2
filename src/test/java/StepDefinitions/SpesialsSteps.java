/**
 * @Author:Otosun Tarih :10/10/2020
 */
package StepDefinitions;

import Pages.DialogContent;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class SpesialsSteps {
    WebDriver driver;
    DialogContent dialogContent = new DialogContent();

    @Given("^Navigate to Specials$")
    public void navigateToSpecials() {
        dialogContent.findElementAndClickFunction("specials");
    }

    @When("^Find the number of products on the page$")
    public void findTheNumberOfProductsOnThePage() {
        dialogContent.findElementListAndNumberOfLstOrPrintItemsOfList("listName",7);
    }

    @Then("^List the names of the products$")
    public void listTheNamesOfTheProducts() {
        dialogContent.findElementListAndNumberOfLstOrPrintItemsOfList("products",0);
    }

    @And("^List the name of the products on sale$")
    public void listTheNameOfTheProductsOnSale() {
        dialogContent.findElementListAndNumberOfLstOrPrintItemsOfList("productsOfSale",2);
        dialogContent.findElementListAndNumberOfLstOrPrintItemsOfList("productsOfSale",0);
    }

    @When("^Find the number of products on the page \"([^\"]*)\" and \"([^\"]*)\"$")
    public void findTheNumberOfProductsOnThePageAnd(String listName, String numberOfItem){
        dialogContent.findElementListAndNumberOfLstOrPrintItemsOfList(listName,Integer.parseInt(numberOfItem));
    }

    @Then("^List the names of the products \"([^\"]*)\"$")
    public void listTheNamesOfTheProducts(String listName) {
        dialogContent.findElementListAndNumberOfLstOrPrintItemsOfList(listName,0);
    }

    @And("^List the name of the products on sale \"([^\"]*)\"$")
    public void listTheNameOfTheProductsOnSale(String listName){
        dialogContent.findElementListAndNumberOfLstOrPrintItemsOfList(listName,0);
    }
}
