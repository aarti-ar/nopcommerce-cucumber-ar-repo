package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement display;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement selectProductList;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputer;


    public void verifyDesktopPage(String expectedMessage){
        verifyMessage(desktopsText,expectedMessage,"Desktops");
        log.info("verifying text : " + desktopsText.toString());
    }
    public void clickOnBuildYourOwnComputer(){
        clickOnElement(buildYourOwnComputer);
        log.info("clicking on : " + buildYourOwnComputer.toString());
    }

}
