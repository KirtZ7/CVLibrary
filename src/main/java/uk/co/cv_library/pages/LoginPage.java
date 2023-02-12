package uk.co.cv_library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.cv_library.utility.Utility;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "//input[@id='cand_email']")
    WebElement eMailField;

    @FindBy(id ="//input[@id='cand_password']")
    WebElement passwordField;


}
