package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DestinationPage {
    public DestinationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="(//a[text()='Destinations'])[2]")
    public WebElement destinationsButton;
    // home Page

    @FindBy(xpath = "//h1[text()='Destinations']")
    public WebElement destinationsPageValidationElement;
    // home / destination Page

    @FindBy(xpath = "(//div[@class='photo-title'])[1]")
    public WebElement bangkokThailadElement;
    // home / destination Page


    @FindBy(xpath = "(//div[@class='photo-title'])[2]")
    public WebElement granvilleSouthCarolinaElement;
    // home / destination Page


    @FindBy(xpath = "(//div[@class='photo-title'])[3]")
    public WebElement buenosAiresArgentinaElement;
    // home / destination Page

    @FindBy(xpath = "(//div[@class='photo-title'])[4]")
    public WebElement marrakeshMoroccoElement;
    // home / destination Page

    @FindBy(xpath = "(//div[@class='photo-title'])[5]")
    public WebElement salinaIslandItalyElement;
    // home / destination Page

    @FindBy(xpath = "(//div[@class='photo-title'])[6]")
    public WebElement istanbulTurkeyElement;
    // home / destination Page

    @FindBy(xpath = "(//div[@class='photo-title'])[7]")
    public WebElement californiaUSAElement;
    // home / destination Page

    @FindBy(xpath = "//h1[text()='Bangkok, Thailand']")
    public WebElement bangkokThailadPageValidationElement;
    // home / destination / bangkok-thailand Page

    @FindBy(xpath = "//h1[text()='Greenville, South Carolina']")
    public WebElement grenvilleSouthCarolinaPageValidationElement;
    // home / destination / greenville-south-carolina Page

    @FindBy(xpath = "//h1[text()='Buenos Aires, Argentina']")
    public WebElement buenosAiresArgentinaPageValidationElement;
    // home / destination / buenos-aires-argentina Page


    @FindBy(xpath = "//h1[text()='Marrakesh, Morocco']")
    public WebElement marrekeshMoroccoPageValidationElement;
    // home / destination/marrakesh-morocco Page


    @FindBy(xpath = "//h1[text()='Salina Island, Italy']")
    public WebElement salinaIslandItalyPageValidationElement;
    //  home / Services / bangkok-thailand Page


    @FindBy(xpath = "//h1[text()='Istanbul, Turkey']")
    public WebElement istanbulTurkeyPageValidationElement;
    // home / destination / istanbul Page


    @FindBy(xpath = "//h1[text()='California, USA']")
    public WebElement californiaUSAPageValidationElement;
    // home / destination/california-usa














}
