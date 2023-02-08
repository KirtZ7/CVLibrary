package uk.co.cv_library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.cv_library.utility.Utility;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    // Java class methods should be made here
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    //accept cookies prompt
    @FindBy(xpath ="//button[@id='save']//span[contains(text(),'Accept All')]" )
    WebElement acceptAllCookies;


    public void acceptCookies() {
        //switch to frame
        driver.switchTo().frame("gdpr-consent-notice");
        // click on accept all element
        clickOnElement(acceptAllCookies);
        // switch back to default content
        driver.switchTo().defaultContent();
    }

    //job title
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleField;

    public void enterJobTitle(String jobTitle){
        sendTextToElement(jobTitleField, jobTitle);
        log.info("Job field is selected :" + jobTitleField.toString());
    }

    //location
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;

    public void enterLocation(String location){
        sendTextToElement(locationField,location);
        log.info("Location field is selected :" + locationField.toString());
    }

    //distanceDropDown
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    public void selectDistance (String distance){
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
        log.info("Distance dropdown is selected :" + distanceDropDown.toString());
    }

    //moreSearchOptionsLink
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOption;

    public void clickOnMoreSearchOption(){
        clickOnElement(moreSearchOption);
        log.info("Clicked on more search option :" + moreSearchOption.toString());
    }

    //SalaryMin
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement minSalaryField;

    public void enterMinSalary (String minSalary){
        sendTextToElement(minSalaryField,minSalary);
        log.info("Clicked on the min salary field :" + minSalaryField.toString());
    }

    //SalaryMax
    @FindBy (xpath = "//input[@id='salarymax']")
    WebElement maxSalaryField;

    public void enterMaxSalary (String maxSalary){
        sendTextToElement(maxSalaryField,maxSalary);
        log.info("Clicked on the max salary field :" + maxSalaryField.toString());
    }

    //SalaryTypeDropDown
    @FindBy (xpath = "//select[@id='salarytype']")
    WebElement dropDownSalaryType;

    public void selectSalaryType(String salaryType){
        selectByVisibleTextFromDropDown(dropDownSalaryType,salaryType);
        log.info("Clicked on salary type dropdown :" + dropDownSalaryType.toString());
    }

    //jobTypeDropDown
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement dropDownJobType;

    public void selectJobType (String jobType){
        selectByVisibleTextFromDropDown(dropDownJobType,jobType);
        log.info("Clicked onm the Job type drop down :" + dropDownJobType.toString());
    }

    //findsJobsButton
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsButton;

    public void clickOnFindJobs(){
        clickOnElement(findJobsButton);
        log.info("Clicked on Find jobs button :" + findJobsButton.toString());
    }

}
