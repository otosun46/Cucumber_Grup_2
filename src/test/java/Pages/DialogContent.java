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

    @FindBy(xpath = "//a[@class='login']")
    public WebElement sigIn;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(xpath= "//a[@title='Contact us']")
    public WebElement contactUs;

    @FindBy(id="SubmitLogin")
    public WebElement loginButton;

    @FindBy(id ="submitMessage")
    public WebElement sendMesageButton;

    @FindBy(id = "cookieconsent")
    public WebElement cookieConsent;

    @FindBy(xpath = "//div[@class='alert alert-danger']//li")
    public WebElement mesageAlert;

    @FindBy(id = "id_contact")
    public WebElement mesageHeading;

    @FindBy(xpath = "//select[@name='id_order']")
    public WebElement orderReference;

    @FindBy(id = "message")
    public WebElement mesageArea;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement successMessage;

    public void findElementAndClickFunction(String element){
        switch (element){
            case "sigIn":
                myElement=sigIn;
                break;

            case "loginButton":
                myElement=loginButton;
                break;
            case "contactUs":
                myElement=contactUs;
                break;

            case "sendMesageButton":
                myElement=sendMesageButton;
                break;



        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String element,String value){
        switch (element){
            case "email":
                myElement=email;
                break;
            case "password":
                myElement=password;
                break;
            case "mesageArea":
                myElement=mesageArea;
                break;
        }
        sendKeysFunction(myElement,value);
    }

    public void findElementAndVerifyContainsText(String elementName, String msg){
        switch (elementName) {
            case "mesageAlert":
                myElement=mesageAlert;
                break;

            case "successMessage":
                myElement = successMessage;
                break;
        }
        verifyElementContainsText(myElement, msg);
    }
    public void findElementAndSelectMenu(String elementName, String value){
        switch (elementName) {
            case "mesageHeading":
                myElement=mesageHeading;
                break;

        }
        selectMenu(myElement,value);
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
