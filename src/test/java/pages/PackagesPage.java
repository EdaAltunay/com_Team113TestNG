package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PackagesPage {
    public PackagesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@type='button']")
    public WebElement cookies;

    @FindBy(xpath ="(//a[text()='Packages'])[2]")
    public WebElement packagesButton;
    // home Page

    @FindBy(xpath = "//h1[text()='Packages']")
    public WebElement packagesPageValidationElement;
    // home / package Page

    @FindBy(xpath = "(//div[@class='photo-title'])[1]")
    public WebElement threeDaysInBuenosAiresElement;
    // home / package Page


    @FindBy(xpath = "(//div[@class='photo-title'])[2]")
    public WebElement tenDaysInBuenosairesElement;
    // home / package Page

    @FindBy(xpath = "(//div[@class='photo-title'])[3]")
    public WebElement sevenDaysInIstanbulElement;
    // home / package Page

    @FindBy(xpath = "(//div[@class='photo-title'])[4]")
    public WebElement threeDaysInBangkokElement;
    // home / package Page

    @FindBy(xpath = "(//div[@class='photo-title'])[5]")
    public WebElement sevenDaysInSalinaIslandElement;
    // home / package

    @FindBy(xpath = "(//div[@class='photo-title'])[6]")
    public WebElement fiveDayCaliforniaElement;
    // home / package

    @FindBy(xpath = "(//div[@class='photo-title'])[7]")
    public WebElement threeDaysInNahcivanElement;
    // home / package
////////////////////////////////////////////////


    @FindBy(xpath = "//div[@class='banner-text']")
    public WebElement threeDaysInBuenosAiresPageValidationElement;
    // home / services / 3-days-in-buenos-aires

    @FindBy(xpath = "//div[@class='banner-text']")
    public WebElement tenDaysInBuenosairesPageValidationElement;
    // home / services / 10-days-in-buenos-aires

    @FindBy(xpath = "//div[@class='banner-text']")
    public WebElement sevenDaysInIstanbulPageValidationElement;
    // home / services / 7-days-in-istanbul

    @FindBy(xpath = "//div[@class='banner-text']")
    public WebElement threeDaysInBangkokPageValidationElement;
    // home / services / 3-days-in-bangkok

    @FindBy(xpath = "//div[@class='banner-text']")
    public WebElement sevenDaysInSalinaIslandPageValidationElement;
    // home / services / 7-days-in-salina-island

    @FindBy(xpath = "//div[@class='banner-text']")
    public WebElement fiveDayCaliforniaPageValidationElement;
    // home / services / california

    @FindBy(xpath = "//div[@class='banner-text']")
    public WebElement threeDaysInNahcivanPageValidationElement;
    // home / services / 3-days-in-nahcivan




















}
