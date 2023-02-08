package uk.co.cv_library.testbase;


import org.testng.annotations.*;
import uk.co.cv_library.propertyreader.PropertyReader;
import uk.co.cv_library.utility.Utility;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    @Parameters("browser")
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

}
