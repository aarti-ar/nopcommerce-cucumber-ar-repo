package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement buildYourOwnComputerText;

    @CacheLookup
    @FindBy(xpath = "//dd[1]//select[1]")
    WebElement processorTab;

    @CacheLookup
    @FindBy(xpath = "//select[@class='valid']//option[@value='1']")
    WebElement processorOption1;

    @CacheLookup
    @FindBy(xpath = "//select[@class='valid']//option[@value='2']")
    WebElement processorOption2;

    @CacheLookup
    @FindBy(xpath = "//dd[2]//select[1]")////dd[1]//select[1]"
    WebElement ramTab;

    @CacheLookup
    @FindBy(css = "#product_attribute_3_6")
    WebElement hdd320GB;

    @CacheLookup
    @FindBy(css = "#product_attribute_3_7")
    WebElement hdd400GB;

    @CacheLookup
    @FindBy(css = "#product_attribute_4_8")
    WebElement osVistaHome;

    @CacheLookup
    @FindBy(css = "#product_attribute_4_9")
    WebElement osVistaPremium;

    @CacheLookup
    @FindBy(xpath = "//label[@for='product_attribute_5_10']")
    WebElement softwareMSOffice;

    @CacheLookup
    @FindBy(xpath = "//label[@for='product_attribute_5_12']")
    WebElement softwareTotalCommander;

    @CacheLookup
    @FindBy(xpath = "//label[@for='product_attribute_5_11']")
    WebElement softwareAcrobatReader;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")   //p[@class='content']
    WebElement productAddedToCartMessage;

    public void selectProcessor(String processor) {

        selectByVisibleTextFromDropDown(processorTab, processor);
        log.info("selecting processor tab : " + processorTab.toString());
    }

    public void selectRAM(String ram) {

        selectByVisibleTextFromDropDown(ramTab, ram);
        log.info("selecting ram tab : " + ramTab.toString());
    }

    public void selectHDD(String hdd) {

        if (hdd.equalsIgnoreCase("320 GB")) {
            clickOnElement(hdd320GB);
            log.info("selecting hdd 320 GB : " + hdd320GB.toString());
        } else if (hdd.equalsIgnoreCase("400 GB [+$100.00]")) {
            clickOnElement(hdd400GB);
            log.info("selecting hdd 400 GB : " + hdd400GB.toString());
        } else {
            System.out.println("hdd not selected");
            log.info("HDD IS NOT SELECTED");
        }
    }

    public void selectOS(String os) {

        if (os.equalsIgnoreCase("Vista Home [+$50.00]")) {
            osVistaHome.click();
            log.info("selecting operating system : " + osVistaHome.toString());
        } else if (os.equalsIgnoreCase("Vista Premium [+$60.00]")) {

            osVistaPremium.click();
            log.info("selecting operation system : " + osVistaPremium.toString());
        }

    }

    public void selectSoftware(String software) {

        if (software.equalsIgnoreCase("Microsoft Office [+$50.00]")) {
            softwareMSOffice.click();
            log.info("selecting software : " + softwareMSOffice.toString());
        } else if (software.equalsIgnoreCase("Acrobat Reader [+$10.00]")) {
            softwareAcrobatReader.click();
            log.info("selecting software  : " + softwareAcrobatReader.toString());
        } else if (software.equalsIgnoreCase("Total Commander [+$5.00]")) {
            softwareTotalCommander.click();
            log.info("selecting software  : " + softwareTotalCommander.toString());
        }
    }

    public void clickOnAddToCart() {

        clickOnElement(addToCartButton);
        log.info("clicking on : " + addToCartButton.toString());
    }

    public void verifyProductAddedToCart() {
        String expected= "The product has been added to your shopping cart";
        String actual= productAddedToCartMessage.getText();
        AssertJUnit.assertEquals("product not added to cart",expected,actual);
        log.info("verifying msg : " +productAddedToCartMessage.toString());

    }

}
