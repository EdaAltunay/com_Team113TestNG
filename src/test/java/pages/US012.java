package pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ServicesPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.Random;

public class US012 extends TestBaseRapor {

    @Test
    public void test01() throws InterruptedException {
        extentTest = extentReports.createTest("tripandway Services buttonu test.",
                "The visitor should be able to go to the Services page by clicking the Services button on the Homepage.");

        //01_The browser opens and the visitor goes to the https://www.tripandway.com homepage.
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info(" goes to tripandway");

        //02_Clicks the Services button.
        ServicesPage servicesPage = new ServicesPage();
        servicesPage.servicesButton.click();
        extentTest.info("Clicks the Services button.");

        //03_Verifies that you've gone to the Services page.
        Assert.assertTrue(servicesPage.servicesPageValidationElement.isDisplayed());
        extentTest.pass("It has been tested that it redirects to the Services page.");
        WebElement[] webElementsIsDisplayedAndIsEnable = {servicesPage.internationalTourElement,
                servicesPage.adventureTourElement,
                servicesPage.cultureTourElement,
                servicesPage.businessTourElement,
                servicesPage.healthTourElement,
                servicesPage.religiousTourElement};



        //04_The Browser is closed.
        Driver.closeDriver();
        extentTest.info("Driver closed");
    }

    @Test
    public void test02() {
        extentTest = extentReports.createTest("Test to verify that Services items are visible and active.",
                "When the visitor is redirected to the Services page by clicking the Services button," +
                         "they should be able to verify that all Services are visible and active.");

        //01_The browser opens and the visitor goes to the https://www.tripandway.com homepage.
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info(" goes to tripandway.");

        //02_Clicks the Services button.
        ServicesPage servicesPage = new ServicesPage();
        servicesPage.servicesButton.click();
        extentTest.info("Clicks Services button.");

        // List of WebElements whose visibility and clickability will be tested.
        WebElement[] webElementsIsDisplayedAndIsEnable = {servicesPage.internationalTourElement,
                                                          servicesPage.adventureTourElement,
                                                          servicesPage.cultureTourElement,
                                                          servicesPage.businessTourElement,
                                                          servicesPage.healthTourElement,
                                                          servicesPage.religiousTourElement};


        // List of String names of WebElements tested for visibility and clickability to be written in the report.
        String[] stringWebElementNames = {"international-tour",
                                          "adventure-tour",
                                          "culture-tour",
                                          "business-tour",
                                          "health-tour",
                                          "religation-tour"};

        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < 6; i++) {

            // The visibility of the next WebElement is tested.
            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isDisplayed());
            extentTest.info("The "+stringWebElementNames[i]+ " element has been tested to be visible.");

            // The clickability of the next WebElement is tested.
            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isEnabled());
            extentTest.info("The "+stringWebElementNames[i]+ " element has been tested to be clickable.");
        }

        softAssert.assertAll();

        // The browser is closed.
        Driver.closeDriver();
        extentTest.info("Driver closed.");


    }
}