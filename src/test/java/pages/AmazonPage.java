package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage() {
        /*
        Bu kod bu classtaki öğeleri driver ile ilişkilendirir
        Bu sayede classtaki webelementlere erişebilmek için @FindBy gibi PageFactory ye yardımcı olan notasyonları
        kullanılabilir hale getirir
         */

        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Yusuf
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;












    //Furkan




}
