package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RobotPage {
    public RobotPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[text()='Select PDF files']") public WebElement selectButton;
    @FindBy(xpath = "//span[text()='Batch189upload.pdf']") public WebElement verify;

}
