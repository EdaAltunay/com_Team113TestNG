package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Packages_Page;
import pages.Traveller_loginPage;
import utilities.Driver;
import utilities.TestBaseRapor;

import javax.swing.*;

public class US24Istanbul extends TestBaseRapor {
    Actions actions;

    @Test
    public void packagesTesti() throws InterruptedException {
        extentTest=extentReports.createTest("Packages Testi",
                "Kullanici basarili bir sekilde packages sayfasina gider");

        Packages_Page packages_page = new Packages_Page();

        Traveller_loginPage traveller_loginPage = new Traveller_loginPage();
        extentTest.info("Kullanici Trip and way anasayfaya gider,email," +
                "password bilgilerini girer basarili bir sekilde login olur");

        //Kullanici Trip and Way anasayfaya gider
        Driver.getDriver().get("https://qa.tripandway.com/");
        //Kullanici login linkine tiklar
        traveller_loginPage.loginlinki.click();
        //Accept butonuna tiklar
        traveller_loginPage.acceptbuton.click();
        // Gecerli Email ve Password bilgilerini ilgili alana yazar, login butonuna tiklar
        traveller_loginPage.email.sendKeys("yekta2124@gmail.com");
        traveller_loginPage.password.sendKeys("123123Y.");
        traveller_loginPage.loginbuton.click();

        extentTest.info("Kullanici Packages sayfasina gider");
        //Kullanici "Packages" butonuna tiklar
        packages_page.packegeLink.click();
        Thread.sleep(3000);

        //Acilan sayfada "Packages" basligini gordugunu test eder
        String expectedPackagesYazisi= "Packages";
        String actualPackagesYazisi= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedPackagesYazisi,actualPackagesYazisi);

        extentTest.pass("Kullanici basarili bir sekilde Packages sayfasina gittigini raporlar");

    }


    @Test
    public void IstanbulTest() throws InterruptedException {
        extentTest=extentReports.createTest("Istanbul Packages Test",
                "Kullanici basarili bir sekilde packages sayfasina gider");
        Packages_Page packages_page = new Packages_Page();
        Traveller_loginPage traveller_loginPage = new Traveller_loginPage();

        extentTest.info("Kullanici Trip and way anasayfaya gider,email," +
                "password bilgilerini girer basarili bir sekilde login olur, Packages linkine tiklar");

        //Kullanici Trip and Way anasayfaya gider
        Driver.getDriver().get("https://qa.tripandway.com/");
        //Kullanici login linkine tiklar
        traveller_loginPage.loginlinki.click();
        //Accept butonuna tiklar
        traveller_loginPage.acceptbuton.click();
        // Gecerli Email ve Password bilgilerini ilgili alana yazar, login butonuna tiklar
        traveller_loginPage.email.sendKeys("yekta2124@gmail.com");
        traveller_loginPage.password.sendKeys("123123Y.");
        traveller_loginPage.loginbuton.click();
        Thread.sleep(3000);

        extentTest.info("Kullanici profil bilgilerini ilgili alana doldurur");
        //Kullanici profil bilgilerini guncellemek icin Update Profile butonuna tiklar
        packages_page.UpdateProfileLink.click();
        //Kullanici acilan sayfada sirasiyla "Phone,Country,Address,State,City,Zip Code" bilgilerini doldurur,
        //ardindan "Update" butonuna tiklar.

        actions=new Actions(Driver.getDriver());
        actions.sendKeys("+905571111111").
                sendKeys(Keys.TAB).
                sendKeys("Turkiye").
                sendKeys(Keys.TAB).
                sendKeys("Mithatpasa Cd. 587/1").
                sendKeys(Keys.TAB).
                sendKeys("Bati").
                sendKeys(Keys.TAB).
                sendKeys("Izmir").
                sendKeys(Keys.TAB).
                sendKeys("35350").
                sendKeys(Keys.ENTER).
                perform();

        //Kullanici "Profile is updated successfully" yazisini gordugunu test eder
        Assert.assertTrue(packages_page.BasariliUpdateProfile.isDisplayed());

        extentTest.pass("Kullanici profil bilgilerini basarili bir sekilde gunceller");

        //Kullanici "Packages" butonuna tiklar
        packages_page.packegeLink.click();
        Thread.sleep(1000);

        //Kullanici "7 days in Istanbul" paketine tiklar
        packages_page.Istanbul.click();
        Thread.sleep(1000);

        packages_page.BookYourSeat.submit();

        //Kullanici "Payment" sayfasina gittigini test eder
        WebElement paymentYaziElementi=Driver.getDriver().findElement(By.xpath("(//*[contains(text()," +
                "'Payment')])[2]"));
        String expectedYazi="PAYMENT";
        String actualYazi= paymentYaziElementi.getText();
        Assert.assertEquals(expectedYazi,actualYazi);

        //Sayfayi kapatir.
        Driver.closeDriver();

    }
    @Test
    public void IstanbulPayment() throws InterruptedException {
        extentTest=extentReports.createTest("Istanbul Payment Testi " +
                "Kullanici odeme islemini basarili bir sekilde tamamlayabilmeli");

        Traveller_loginPage traveller_loginPage=new Traveller_loginPage();
        Packages_Page packages_page=new Packages_Page();

        extentTest.info("Kullanici Trip and way anasayfaya gider,email," +
                "password bilgilerini girer basarili bir sekilde login olur, Packages linkine tiklar");

        //Kullanici Trip and Way anasayfaya gider
        Driver.getDriver().get("https://qa.tripandway.com/");
        //Kullanici login linkine tiklar
        traveller_loginPage.loginlinki.click();
        //Accept butonuna tiklar
        traveller_loginPage.acceptbuton.click();
        // Gecerli Email ve Password bilgilerini ilgili alana yazar, login butonuna tiklar
       traveller_loginPage.email.sendKeys("yekta2124@gmail.com");
        traveller_loginPage.password.sendKeys("123123Y.");
        traveller_loginPage.loginbuton.click();
        Thread.sleep(3000);

        extentTest.info("7 Days In Istanbul paketini secer");
        //Kullanici "Packages" butonuna tiklar
        packages_page.packegeLink.click();
        Thread.sleep(5000);
        //Kullanici "7 days in Istanbul" paketine tiklar
        packages_page.Istanbul.click();
        Thread.sleep(5000);



        //Kullanici "Book Your Seat" butonuna tiklar
        packages_page.BookYourSeat.submit();
        //Kullanici "Pay with Card" butonuna tiklar
        packages_page.PaywCard.submit();
        Thread.sleep(5000);

        extentTest.info("Odeme islemi icin kart bilgilerini girer");

        //Kullanici sirasiyla "Card Number","MM/YY","CVC" bilgilerini doldurur,"Pay $7,000.00" butonuna tiklar
        actions=new Actions(Driver.getDriver());
        actions.sendKeys("4242424242424242").
                sendKeys(Keys.TAB).
                sendKeys("12/34").
                sendKeys(Keys.TAB).
                sendKeys("567").
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
        //Kullanici "Payment is successful!" yazisini gorur
        packages_page.PaymentisSuc.isDisplayed();

        extentTest.pass("Kullanici odeme islemini basarili bir sekilde tamamlayabildi");

        //Sayfayi kapatir
        Driver.closeDriver();

}

}
