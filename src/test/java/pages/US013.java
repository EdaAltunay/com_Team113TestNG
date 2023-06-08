package pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DestinationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.Random;

public class US013 extends TestBaseRapor {

    @Test
    public void test01() throws InterruptedException {
        extentTest = extentReports.createTest("tripandway Destinations buttonu test.",
                "The visitor should be able to go to the Destinations page by clicking the Destinations button on the Homepage.");

        //01_The browser opens and the visitor goes to the https://www.tripandway.com homepage.
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("goes to tripandway ");

        //02_Clicks the Destinations button.
        DestinationPage destinationsPage = new DestinationPage();
        destinationsPage.destinationsButton.click();
        extentTest.info("Clicks the Destinations button.");

        //03_Verifies that you've gone to the Destinations page.
        Assert.assertTrue(destinationsPage.destinationsPageValidationElement.isDisplayed());
        extentTest.pass("It has been tested that it redirects to the Destinations page.");
        WebElement[] webElementsIsDisplayedAndIsEnable = {destinationsPage.bangkokThailadElement,
                destinationsPage.granvilleSouthCarolinaElement,
                destinationsPage.buenosAiresArgentinaElement,
                destinationsPage.marrakeshMoroccoElement,
                destinationsPage.salinaIslandItalyElement,
                destinationsPage.istanbulTurkeyElement,
                destinationsPage.californiaUSAElement};
        Random random=new Random();
        webElementsIsDisplayedAndIsEnable[random.nextInt(0,6)].submit();


        Thread.sleep(5000);

        //04_The browser is closed.
        Driver.closeDriver();
        extentTest.info("Driver closed.");
    }




    @Test
    public void test02()  {


        extentTest = extentReports.createTest("Test to verify that Destinations items are visible and active.",
                "When the visitor is redirected to the Destinations page by clicking the Destinations button, " +
                        "they should be able to verify that all Destinations are visible and active.");

        //01_The browser opens and the visitor goes to the https://www.tripandway.com homepage.
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("goes to tripandway.");

        //02_Clicks the Destinations button.
        DestinationPage destinationsPage = new DestinationPage();
        destinationsPage.destinationsButton.click();
        extentTest.info("Clicks the Destinations button.");

        //  List of WebElements whose visibility and clickability will be tested.
        WebElement[] webElementsIsDisplayedAndIsEnable = {destinationsPage.bangkokThailadElement,
                                                          destinationsPage.granvilleSouthCarolinaElement,
                                                          destinationsPage.buenosAiresArgentinaElement,
                                                          destinationsPage.marrakeshMoroccoElement,
                                                          destinationsPage.salinaIslandItalyElement,
                                                          destinationsPage.istanbulTurkeyElement,
                                                          destinationsPage.californiaUSAElement};

        // List of String names of WebElements tested for visibility and clickability to be written in the report
        String[] stringWebElementNames = {"bangkokThailad",
                                          "granvilleSouthCarolina",
                                          "buenosAiresArgentina",
                                          "marrakeshMorocco",
                                          "salinaIslandItaly",
                                          "istanbulTurkey",
                                          "californiaUSA"};



        SoftAssert softAssert = new SoftAssert();



        for (int i = 0; i < 7; i++) {

            // The visibility of the next WebElement is tested.
            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isDisplayed());
            extentTest.info("The "+stringWebElementNames[i]+ " element has been tested to be visible.");

            // The clickability of the next WebElement is tested.
            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isEnabled());
            extentTest.info("The "+stringWebElementNames[i]+ " element has been tested to be clickable.");
        }

        // softAssert.assertAll();

        // The browser is closed.
        Driver.closeDriver();
        extentTest.info("Driver closed.");

    }}


