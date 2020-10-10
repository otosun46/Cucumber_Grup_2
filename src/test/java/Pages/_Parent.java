/**
 * @Author:Otosun Tarih :07/10/2020
 */
package Pages;

import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class _Parent {
    WebDriver driver;
    WebDriverWait wait;

    public _Parent() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();

    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);

    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void verifyElementContainsText(WebElement element, String text) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
        System.out.println(element.getText());
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }

    public void beklet(int milisaniye) {
        try {
            Thread.sleep(milisaniye);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void selectMenu(WebElement menuName,String index){
//        System.out.println("Select menuye girdi");
        Select menuSecim = new Select(menuName);
        menuSecim.selectByIndex(Integer.parseInt(index));
    }

    public void verifyTheNumberOfItemsOnTheList(List<WebElement> elementList,int numberOfItems){
        System.out.println("Number of items= "+elementList.size());
        Assert.assertTrue(elementList.size()==numberOfItems);
    }

    public  void compareList(List<WebElement> webElmList, List<String> stringList) {
        int i = 0;
        for (WebElement e : webElmList) {
            Assert.assertEquals(e.getText(), stringList.get(i++));
            // System.out.println(e.getText());
        }
    }

    public  void printToList(List<WebElement> webElmList) {
        for (WebElement e : webElmList) {
             System.out.println(e.getText());
            System.out.println("------------------------------------------------------------");
        }
    }
    public void clickToWebElementOfElementList(List<WebElement>elementList){
        for (WebElement element:elementList) {
            clickFunction(element);
            System.out.println(element.getText());

        }
    }
}
