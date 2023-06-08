package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Packages_Page;
import pages.Traveller_loginPage;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.List;
import java.util.Random;

import utilities.TestBaseRapor;

public class US24 extends TestBaseRapor {

    @Test
    public void packages() throws InterruptedException {

    extentTest = extentReports.createTest("Herhangi bir package'in secilip odeme yapilmasi testi.",
            "Kullanici login olup basarili bir sekilde package sayfasina gidebilmeli " +
                      "ve herhangi bir package paketini satinalabilmeli.");

    Packages_Page packages_page = new Packages_Page();
    Traveller_loginPage traveller_loginPage = new Traveller_loginPage();

    //1_Kullanici Trip and Way anasayfaya gider
    Driver.getDriver().get("https://qa.tripandway.com/");
    extentTest.info("Kullanici tripandway anasayfaya gider.");

    //2_Kullanici login olmak icin login butonuna tiklar.
    traveller_loginPage.loginlinki.click();
    extentTest.info("Kullanici login olmak icin login butonuna tiklar.");

       //Accept butonuna tiklar.
       traveller_loginPage.acceptbuton.click();

    //3_Gecerli Email ve Password bilgilerini ilgili alana yazar, login butonuna tiklar
    traveller_loginPage.email.sendKeys("yekta2124@gmail.com");
    traveller_loginPage.password.sendKeys("123123Y.");
    Thread.sleep(3000);

    traveller_loginPage.loginbuton.click();

    extentTest.info("Kullanici gecerli email ve passaword bilgilerini girerek siteye login olur.");


    //4_Kullanici "Packages" butonuna tiklar
    packages_page.packegeLink.click();
    extentTest.info("Kullanici Packages butonuna tiklar.");
    Thread.sleep(3000);

    //5_Kullanici herhangi bir package secer.
    WebElement [] packagesList={packages_page.Istanbul,
                                packages_page.bangkok,
                                packages_page.salina,
                                //packages_page.threeDaysBuenos,
                                //packages_page.tenDaysBuenos
                                packages_page.california};

          SoftAssert softAssert=new SoftAssert();
          Random random=new Random();
          Actions actions=new Actions(Driver.getDriver());
          JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();


          WebElement webElement=packagesList[random.nextInt(0,3)];
          // random objesi ile listeden herhangi bir web element seceriz.
         actions.sendKeys(Keys.PAGE_DOWN).build().perform();
         // action objesini kullanarak sayfada biraz asagi indik.

    jse.executeScript("arguments[0].click();",webElement);
    Thread.sleep(3000);

    //6_Kullanici "Book Your Seat" butonuna tiklar

    jse.executeScript("arguments[0].click();",packages_page.BookYourSeat);
    extentTest.info("Kullanici yerini ayirtmak icin BookYourSeat butonuna tiklar.");
    Thread.sleep(3000);

    //7_Kullanici "Pay with Card" butonuna tiklar
    jse.executeScript("arguments[0].click();",packages_page.PaywCard);
    extentTest.info("Kullanici odeme yapmak icin PayWithCard butonuna tiklar.");
    Thread.sleep(3000);

    //8_ Kullanici odemeyi gercekletirebilmek icin sirasiyla "Card Number","MM/YY","CVC" bilgilerini doldurur
    //   ve "Pay $7,000.00" butonuna tiklar

        actions.sendKeys("4242424242424242").
                sendKeys(Keys.TAB).
                sendKeys("12/34").
                sendKeys(Keys.TAB).
                sendKeys("567").
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
    extentTest.info("Kullanici odemeyi gercekletirebilmek icin sirasiyla; Card Number, MM/YY, CVC bilgilerini doldurur" +
                               "ve Pay $7,000.00 butonuna tiklar");
    //9_Kullanici "Payment is successful!" yazisini gorur.
   softAssert.assertTrue(packages_page.PaymentisSuc.isDisplayed());
    extentTest.pass("Kullanici odeme islemini basarili bir sekilde tamamlayabildigini dogrular.");

    //10_Driver kapatir.
    Driver.closeDriver();

    }
  }
