package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ServicesPage {
    public ServicesPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[text()='Services'])[2]")
    public WebElement servicesButton;
    // home Page

    @FindBy(xpath = "//h1[text()='Services']")
    public WebElement servicesPageValidationElement;
    // home / services Page

    @FindBy(xpath = "(//div[@class='ser-text'])[1]")
    public WebElement internationalTourElement;
    // home / services Page

    @FindBy(xpath = "(//div[@class='ser-text'])[2]")
    public WebElement adventureTourElement;
    // home / services Page

    @FindBy(xpath = "(//div[@class='ser-text'])[3]")
    public WebElement cultureTourElement;
    // home / services Page
    @FindBy(xpath = "(//div[@class='ser-text'])[4]")
    public WebElement businessTourElement;
    // home / services Page
    @FindBy(xpath = "(//div[@class='ser-text'])[5]")
    public WebElement healthTourElement;
    // home / services Page

    @FindBy(xpath = "(//div[@class='ser-text'])[6]")
    public WebElement religiousTourElement;
    // home / services Page



    @FindBy(xpath = "//h1[text()='International Tour']")
    public WebElement internetionalTourPageValidationElement;
    // home / services / international-tour Page

    @FindBy(xpath = "//h1[text()='Adventure Tour']")
    public WebElement adventureTourPageValidationElement;
    // home / services / adventure-tour Page

    @FindBy(xpath = "//h1[text()='Culture Tour']")
    public WebElement cultureTourPageValidationElement;
    //  home / services / culture-tour Page

    @FindBy(xpath = "//h1[text()='Bussiness Tour']")
    public WebElement businessTourPageValidationElement;
    // home / services / business-tour Page

    @FindBy(xpath = "//h1[text()='Health Tour']")
    public WebElement healthTourPageValidationElement;
    // home / services / health-tour Page


    @FindBy(xpath = "//h1[text()='Religious Tour']")
    public WebElement religiousTourPageValidationElement;
    // home / services / religation-tour Page




}
