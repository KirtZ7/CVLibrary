package uk.co.cv_library.testsuite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import uk.co.cv_library.pages.HomePage;
import uk.co.cv_library.pages.ResultsPage;
import uk.co.cv_library.testbase.TestBase;


public class JobSearchTest extends TestBase {

    ResultsPage resultsPage;


    @DataProvider
    public static Object[][] jobSearchData() {
        return new Object[][] {
                { "Software Engineer", "London", "up to 35 miles", "50000", "100000", "Per annum", "Apprenticeship",},
                { "Test Engineer", "Manchester", "up to 10 miles", "30000", "80000", "Per month", "Part Time",},
                { "Product Manager", "Birmingham", "up to 500 miles", "60000", "120000", "Per month", "Contract",},
                { "DevOps Engineer", "Liverpool", "up to 750 miles", "70000", "150000", "Per day", "Temporary",},
                { "Data Scientist", "Newcastle", "up to 50 miles", "80000", "180000", "Per hour", "Permanent",},
                { "Front End Developer", "Bristol", "up to 25 miles", "40000", "90000", "Per hour", "Permanent",}


        };
    }

    //goto login page and log in to account
    @Test( dataProvider = "jobSearchData")
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle,
                                                                    String location,
                                                                    String distance,
                                                                    String minSalary,
                                                                    String maxSalary,
                                                                    String salaryType,
                                                                    String jobType)  { //String result
        HomePage homePage = new HomePage();
        homePage.acceptCookies();
        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOption();
        homePage.enterMinSalary(minSalary);
        homePage.enterMaxSalary(maxSalary);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobs();
        //resultsPage.resultsPageText(result);
    }

}
