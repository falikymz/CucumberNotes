package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepDefinition {
    AmazonPage amazonPage =new AmazonPage();
    @Given("Kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().refresh();
    }
    @When("Arama kutusunda iphone aratir")
    public void arama_kutusunda_iphone_aratir() {
        amazonPage.searchBox.sendKeys("iphone");
        amazonPage.searchBox.submit();
    }
    @When("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("Arama kutusunda samsung aratir")
    public void aramaKutusundaSamsungAratir() {
        amazonPage.searchBox.sendKeys("samsung", Keys.ENTER);
    }

    @When("Arama kutusunda nokia aratir")
    public void aramaKutusundaNokiaAratir() {
        amazonPage.searchBox.sendKeys("nokia",Keys.ENTER);
    }

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
            Driver.getDriver().get(url);
            ReusableMethods.bekle(1);
            Driver.getDriver().navigate().refresh();
    }

    @And("Arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String str) {
        amazonPage.searchBox.sendKeys(str,Keys.ENTER);

    }
}
