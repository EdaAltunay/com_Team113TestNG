package pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PackagesPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US014 extends TestBaseRapor {

    @Test
    public void test01()  {
        extentTest = extentReports.createTest("tripandway Packages buttonu test.",
                "The visitor should be able to go to the Packages page by clicking the Packages button on the Homepage.");

        //01_The browser opens and the visitor goes to the https://www.tripandway.com homepage.
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("goes to tripandway.");

        //02_Clicks the Packages button.
        PackagesPage packagesPage= new PackagesPage();
        packagesPage.packagesButton.click();
        extentTest.info("Clicks the Packages button.");

        //03_Verifies that you've gone to the Packages page.
        Assert.assertTrue(packagesPage.packagesPageValidationElement.isDisplayed());
        extentTest.pass("It has been tested that it redirects to the Packages page.");



        //04_The browser is closed.
        Driver.closeDriver();
        extentTest.info("Driver closed.");
    }


    @Test
    public void test02(){
        extentTest = extentReports.createTest("Test to verify that Packages items are visible and active.",
                "When the visitor is redirected to the Packages page by clicking the Packages button, " +
                          "they should be able to verify that all Packages are visible and active.");

        //01_The browser opens and the visitor goes to the https://www.tripandway.com homepage.
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("goes to tripandway.");

        //02_Clicks the Packages button.
        PackagesPage packagesPage=new PackagesPage();
        packagesPage.packagesButton.click();
        extentTest.info("Clicks the Packages button.");

        // List of WebElements whose visibility and clickability will be tested.
        WebElement[] webElementsIsDisplayedAndIsEnable = {packagesPage.threeDaysInBuenosAiresElement,
                                                          packagesPage.tenDaysInBuenosairesElement,
                                                          packagesPage.sevenDaysInIstanbulElement,
                                                          packagesPage.threeDaysInBangkokElement,
                                                          packagesPage.sevenDaysInSalinaIslandElement,
                                                          packagesPage.fiveDayCaliforniaElement,
                                                          packagesPage.threeDaysInNahcivanElement};


        // List of String names of WebElements tested for visibility and clickability to be written in the report.
        String[] stringWebElementNames = {" 3-days-in-buenos-aires ",
                                          " 10-days-in-buenos-aires ",
                                          " 7-days-in-istanbul ",
                                          " 3-days-in-bangkok ",
                                          " 7-days-in-salina-island ",
                                          " 5-Day-california ",
                                          " 3-days-in-nahcivan "};

        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < 7; i++) {

            // The visibility of the next WebElement is tested.
            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isDisplayed());
            extentTest.info("The "+stringWebElementNames[i]+ " element has been tested to be visible.");

            // The clickability of the next WebElement is tested.
            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isEnabled());
            extentTest.info("The "+stringWebElementNames[i]+ " element has been tested to be clickable.");
        }

        //softAssert.assertAll();

        // The browser is closed.
        Driver.closeDriver();
        extentTest.info("Driver closed.");






}}
