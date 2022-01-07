package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")   //h1[normalize-space()='Register']
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='male']")
    WebElement maleRadio;

    @CacheLookup
    @FindBy(xpath = "//span[@class='female']")
    WebElement femaleRadio;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement birthDayDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement birthMonthDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement birthYearDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")  //span[@id='FirstName-error']
    WebElement firstNameRequiredErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequiredErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailIsRequiredErrorMessage;

    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordIsRequiredErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmationPasswordErrorMessage;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompleteMessage;

    @FindBy(xpath = "(//a[normalize-space()='Continue'])[1]")
    WebElement continueButton;
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutButton;

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginOption;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;


    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("female")) {
            clickOnElement(femaleRadio);
            log.info("clicking on  : " + femaleRadio.toString());
        } else if (gender.equalsIgnoreCase("male")) {
            clickOnElement(maleRadio);
            log.info("clicking on  : " + maleRadio.toString());
        } else {
            System.out.println("Select Gender First");
        }
    }

    public void enterFirstName(String firstNameValue) {
        sendTextToElement(firstName, firstNameValue);
        log.info("Entering firstname  : " + firstName.toString());
    }

    public void enterLastName(String lastNameValue) {
        sendTextToElement(lastName, lastNameValue);
        log.info("Entering lastname  : " + lastName.toString());
    }

    public void selectBirthDay(String value) {
        selectByValueFromDropDown(birthDayDropDown, value);
        log.info("Entering Birthday  : " + birthDayDropDown.toString());
    }

    public void selectBirthMonth(String value) {
        selectByValueFromDropDown(birthMonthDropDown, value);
        log.info("Entering month  : " + birthMonthDropDown.toString());
    }

    public void selectBirthYear(String value) {
        selectByValueFromDropDown(birthYearDropDown, value);
        log.info("Entering year : " + birthYearDropDown.toString());
    }

    public void enterEmail(String emailAddress) {
        sendTextToElement(email, emailAddress);
        log.info("Entering email  : " + email.toString());
    }

    public void enterPassword(String passwordValue) {
        sendTextToElement(password, passwordValue);
        log.info("Entering password  : " + password.toString());
    }

    public void enterConfirmPassword(String confirmPasswordValue) {
        sendTextToElement(confirmPassword, confirmPasswordValue);
        log.info("Entering confirm password : " + confirmPassword.toString());

    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("clicking on register button : " + registerButton.toString());
    }

    public void verifyRegistrationComplete(String expectedMessage) {
        verifyMessage(registerText, expectedMessage, "Wrong Page");
        log.info("verifying registration complete text : " + registerText.toString());

    }

    public void clickOnRegisterLink() {

        clickOnElement(registerLink);
        log.info("clicking on register link : " + registerLink.toString());
    }

    public String gettextRegistertext() {
        String verify = getTextFromElement(registerText);
        log.info("getting text from register text : " + registerText.toString());
        return verify;
    }

    public void verifyRegisterText() {
        String expected = "Register";
        String actual = getTextFromElement(registerText);
        AssertJUnit.assertEquals("This is not register page", expected, actual);
        log.info("verifying text : " + registerText.toString());

    }

    public void verifyTheErrorMessageFirstNameIsRequired() {
        String expected = "First name is required.";
        String actualmsg = firstNameRequiredErrorMessage.getText();
        AssertJUnit.assertEquals("text not matched", expected, actualmsg);
        log.info("verifying text : " + firstNameRequiredErrorMessage.toString());
    }

    public void verifyTheErrorMessageLastNameIsRequired() {
        String expected = "Last name is required.";
        String actualmsg = lastNameRequiredErrorMessage.getText();
        AssertJUnit.assertEquals("text not matched", expected, actualmsg);
        log.info("verifying text : " + lastNameRequiredErrorMessage.toString());
    }

    public void verifyTheErrorMessageEmailIsRequired() {
        String expected = "Email is required.";
        String actualmsg = emailIsRequiredErrorMessage.getText();
        AssertJUnit.assertEquals("text not matched", expected, actualmsg);
        log.info("verifying text : " + emailIsRequiredErrorMessage.toString());
    }

    public void verifyTheErrorMessagePasswordIsRequired() {
        String expected = "Password is required.";
        String actualmsg = passwordIsRequiredErrorMessage.getText();
        AssertJUnit.assertEquals("text not matched", expected, actualmsg);
        log.info("verifying text : " + passwordIsRequiredErrorMessage.toString());
    }

    public void verifyTheErrorMessageForConfirmPasswordIsRequired() {

        String expected = "Password is required.";
        String actualmsg = confirmationPasswordErrorMessage.getText();
        AssertJUnit.assertEquals("text not matched", expected, actualmsg);
        log.info("verifying text : " + confirmationPasswordErrorMessage.toString());
    }

}
