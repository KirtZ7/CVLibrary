package uk.co.cv_library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.cv_library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    // Java class methods should be made here, below is an example .
//Click on LOGIN
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "//a[@id='nav-login']")
    WebElement loginButton;

    @FindBy(id = "//h1[contains(text(),' Login')]")
    WebElement loginText;

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicked on Login Button: " + loginButton.toString());
    }

    public String getLoginText() {
        log.info("Login text visible: " + loginButton.getText());
        return getTextFromElement(loginText);
    }

}
