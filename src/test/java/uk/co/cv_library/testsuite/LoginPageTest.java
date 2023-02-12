package uk.co.cv_library.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.cv_library.pages.HomePage;
import uk.co.cv_library.pages.LoginPage;
import uk.co.cv_library.testbase.TestBase;

public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    //Click on login Page
    @Test
    public void goToLoginPage(){
        homePage.clickOnLoginButton();
        String expectText = " Login";
        String actualMessage = homePage.getLoginText();
        Assert.assertEquals(expectText,actualMessage, "Login page is displayed");
    }

}
