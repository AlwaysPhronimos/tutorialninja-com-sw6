package com.tutorialninja.demo.pages;

import com.tutorialninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountsPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;
    //By accountLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreatedText;
    // By accountCreatedText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    public void clickOnMyAccountLink() {
    }

    public void callSelectMyAccountLogoutMethod() {
    }

    public void callSelectMyAccountLoginMethod() {
    }

    public void fillInEmailPassword() {
    }
}





