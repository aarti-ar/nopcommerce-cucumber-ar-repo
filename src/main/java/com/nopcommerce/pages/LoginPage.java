package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement logIn;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement textLogout;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutOption;

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("clicking on : " +loginButton.toString());
    }

    public void verifyWelcomeText() {
        String expected="Welcome, Please Sign In!";
        String actual= welcomeText.getText();
        AssertJUnit.assertEquals("text not matched",expected,actual);

    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Entering email : " +emailField.toString());


    }

    public void enterPassword(String pass) {
        sendTextToElement(passwordField, pass);
        log.info("Entering password: " +passwordField.toString());

    }

    public void clickOnlogOutButton() {
        clickOnElement(logOutButton);
        log.info("clicking on : " +logOutButton.toString());
    }
    public void clickOnLogin(){
        clickOnElement(logIn);
        log.info("clicking on : " +logIn.toString());
    }

    public void verifyErrorMessage() {

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = getTextFromElement(errorMessage);
        AssertJUnit.assertEquals("Error message not displayed",expectedErrorMessage,actualErrorMessage);
        log.info("verifying error text : " +errorMessage.toString());
    }

    public void verifyLogOutOption() {
        logOutOption.isDisplayed();
//      verifyMessage(logOutOption,"Log out","Log out button not displayed");
//     log.info("verifying logout button : " +logIn.toString());

    }
}
