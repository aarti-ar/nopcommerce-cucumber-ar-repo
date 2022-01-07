package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTab;

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
        log.info("clicking on : " +registerLink.toString());
    }
    public void clickOnComputerTab(){
        clickOnElement(computerTab);
        log.info("clicking on : " +computerTab.toString());

    }
}
