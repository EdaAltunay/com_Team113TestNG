package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Packages_Page {


    public Packages_Page() {

        PageFactory.initElements(Driver.getDriver(),this);}

    //@FindBy(xpath = "//input[@id='card_number']")
    // public WebElement BangCardNo;
    // @FindBy(xpath ="(//*[contains(text(),'3 days in Bangkok')])[1]")
    //public WebElement BangkokButon;

    @FindBy(xpath = "//*[@id=\"menu\"]/li[4]/a")
    public WebElement packegeLink;

    @FindBy(linkText = "Update Profile")
    public WebElement UpdateProfileLink;

    @FindBy(xpath = "//*[contains(text(),'Profile is updated successfully']")
    public WebElement SucProfileUpdate;

    @FindBy(xpath = "//*[@name='traveller_phone']")
    public WebElement PhoneTab;

    @FindBy(xpath = "//*[@name='traveller_country']")
    public WebElement ContryTab;

    @FindBy(xpath = "//*[@name='traveller_address']")
    public WebElement AddressTab;

    @FindBy(xpath = "//*[@name='traveller_state']")
    public WebElement StateTab;

    @FindBy(xpath = "//*[@name='traveller_city']")
    public WebElement CityTab;

    @FindBy(xpath = "//*[@name='traveller_zip']")
    public WebElement ZipcodeTab;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement UpdateButon;

    @FindBy(xpath = "//*[contains(text(),'Packages')]")
    public WebElement SucPackages;
    @FindBy(xpath = "//*[contains(text(),'Profile is updated successfully')]")
    public WebElement BasariliUpdateProfile;

    @FindBy(xpath = "//select[@id='numberPerson']")
    public WebElement totalPerson;

    @FindBy(xpath = "//*[@class='stripe-button-el']")
    public WebElement PaywCard;
    @FindBy(xpath = "//*[@id='card_number']")
    public WebElement CardNo;
    @FindBy(xpath = "//*[@class='cardExpiresInput input left bottom']")
    public WebElement MMYY;
    @FindBy(xpath = "//*[@id='cc-csc']")
    public WebElement Cvc;
    @FindBy(xpath = "//*[@class='iconTick']")
    public WebElement PayIst;
    @FindBy(xpath = "//*[contains(text(),'Payment is successful!')]")
    public WebElement PaymentisSuc; // Odeme isleminin basarili bir sekilde gerceklestigini test etme
    @FindBy(xpath = "(//*[contains(text(),'Payment')])[2]")
    public WebElement PaymentTitle;

    @FindBy(xpath = "(//span[@class='fz_22'])[4]")
    public WebElement bangkok;
    @FindBy(xpath = "//*[contains(text(),'7 days in Istanbul')]")
    public WebElement Istanbul;
    @FindBy(xpath = "(//*[contains(text(),'3 days in Buenos Aires')])[1]")
    public WebElement threeDaysBuenos;
    @FindBy(xpath = "(//*[contains(text(),'10 days in Buenos Aires')])[1]")
    public WebElement tenDaysBuenos;

    @FindBy(xpath = "//*[contains(text(),'Pay $5,500.00')]")
    public WebElement PayBang;
    @FindBy(xpath = "//button[@class='btn btn-info btn-lg']")
    public WebElement BYSeatBang;
    @FindBy(xpath = "//button[@class='stripe-button-el']")
    public WebElement payWithCard;

    @FindBy(xpath = "(//*[contains(text(),'7 days in Salina Island')])[1]")
    public WebElement salina;
    @FindBy(xpath = "(//*[contains(text(),'5 Day California')])[1]")
    public WebElement california;

    @FindBy(xpath = "(//*[text()='Packages'])[2]")
    public WebElement packages;
    @FindBy(xpath = "//button[@class='btn btn-info btn-lg']")
    public WebElement BookYourSeat;

    @FindBy(xpath = "//*[@class='fas fa-history']")
    public WebElement paymentHistory;

    @FindBy(xpath = "(//*[@class='text fz_25'])[1]")
    public WebElement completed;

    @FindBy(xpath = "//h1[text()='View All Payments']")
    public WebElement viewAllPayments;


}
