package uk.co.cv_library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.cv_library.utility.Utility;

public class ResultsPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    // Java class methods should be made here
    public ResultsPage(){
        PageFactory.initElements(driver,this);
    }

    //result text
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultsText;



    public void resultsPageText(String expectedResult){
        log.info("Results page text: " + resultsText.getText());
        String actualResult = getTextFromElement(resultsText);
        Assert.assertEquals(actualResult, expectedResult, "The actual result '" + actualResult + "' does not match the expected result '" + expectedResult + "'");
    }


}
