package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalPage {
    public BlueRentalPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@role='button']")
    public WebElement login;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement mailAddress;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//button[@id='dropdown-basic-button']")
    public WebElement profilButton;

    @FindBy(xpath = "//*[contains( text(), 'User with email fake@bluerentalcars.com not found'  )]")
    public WebElement negatifloginVerify;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement logoutButton;

    @FindBy(xpath = "//li//a[@role='button']")
    public WebElement loginButton;

    @FindBy(id = "formBasicEmail")
    public WebElement email;

    @FindBy(id = "dropdown-basic-button")
    public WebElement loginVerify;

    @FindBy(xpath = "//*[.='Profile']")
    public WebElement profile;

    @FindBy(xpath = "//em")
    public WebElement profileEmail;

    @FindBy(xpath = "//*[text()='Bad credentials']")
    public WebElement badCredentieslText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement emailMustBeValidEmail;

    @FindBy(xpath = "//select[@name='car']")
    public WebElement carSelect;
    @FindBy(xpath = "//input[@name='pickUpLocation']")
    public WebElement pickUp;
    @FindBy(xpath = "//input[@name='dropOfLocation']")
    public WebElement dropOff;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement homePageSubmit;
    @FindBy(xpath = "//*[contains(text(), 'Please first login')]")
    public WebElement plsFirstLoginText;
}
