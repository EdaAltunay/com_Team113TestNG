package tests.Exercises;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class E01 {


    @Test
    public void test(){
        QualitydemyPage qualitydemyPage=new QualitydemyPage();

    // QUALITYDEMY ANA SAYFAYA GIDIN

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
    // login linkine tiklayin
        qualitydemyPage.ilkLoginLinki.click();

    // gecerli username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
    // login butonuna basin
        qualitydemyPage.loginButonu.submit();
    // basarili olarak giris yapildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisKontrolElementi.isDisplayed());
    // sayfayi kapatin
        Driver.closeDriver();

}}
