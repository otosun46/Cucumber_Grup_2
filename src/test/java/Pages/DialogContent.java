/**
 * @Author:Otosun Tarih :07/10/2020
 */
package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DialogContent extends _Parent {
    WebElement myElement;

    public DialogContent() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "mat-input-0")
    public WebElement username;

    @FindBy(id = "mat-input-1")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN'")
    public WebElement loginButton;

    @FindBy(linkText ="Got it!")
    public WebElement gotItBtn;

    @FindBy(id = "cookieconsent")
    public WebElement cookieConsent;

    public void findElementAndClickFunction(String element){
        switch (element){
            case "loginButton":
                myElement=loginButton;
                break;
            case "gotItBtn":
                myElement=gotItBtn;
                break;

        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String element,String value){
        switch (element){
            case "username":
                myElement=username;
                break;
            case "password":
                myElement=password;
                break;
        }
        sendKeysFunction(myElement,value);
    }

    public void findElementAndVerifyContainsText(String elementName, String msg){
        switch (elementName) {
            case "msjContainer":
//                myElement = msjContainer;
                break;

            case "errorMessage":
//                myElement = errorMessage;
                break;
        }
        verifyElementContainsText(myElement, msg);
    }

    public void editAndDeleteFunction(String countryName, String editOrDelete) {
        List<WebElement> btnList=new ArrayList<>();
        beklet(1000);
        if (editOrDelete.equalsIgnoreCase("delete")) {
//            btnList = waitVisibleListAllElement(deleteButtonList);
        }
//        else btnList= waitVisibleListAllElement(editButtonList);

//        for (int i = 0; i < waitVisibleListAllElement(nameList).size(); i++) {
//            System.out.println(waitVisibleListAllElement(nameList).get(i).getText());
//            if (waitVisibleListAllElement(nameList).get(i).getText().equalsIgnoreCase(countryName)) {
//                clickFunction(btnList.get(i));
//            }
        }
}
