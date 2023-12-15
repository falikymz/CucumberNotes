package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BlueRentalPage;
import pages.DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelReader;
import utilities.ReusableMethods;

import java.util.List;


public class BlueRentalStepDefinition {
    BlueRentalPage blueRentalPage=new BlueRentalPage();
    @Given("Kullanici blueRentalCar sayfasina gider")
    public void kullaniciBlueRentalCarSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
    }

    @When("login butonuna tiklar")
    public void loginButtonunaTiklar() {
    blueRentalPage.login.click();
    }

    @And("Email ve password bilgileri ile login olur")
    public void emailVePasswordBilgileriIleLoginOlur() {
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"));
        blueRentalPage.password.sendKeys(ConfigReader.getProperty("blueRentalPassword"), Keys.ENTER);
    }

    @And("Kullanici {string} ve {string} bilgilerini girer")
    public void kullaniciVeBilgileriniGirer(String email, String password) {
        blueRentalPage.email.sendKeys(email);
        blueRentalPage.password.sendKeys(password+Keys.ENTER);
    }

    @Then("Login oldugunu dogrular")
    public void loginOldugunuDogrular() {
        //1 login olduktan sonra button web elementinde login yazısı görünmemeli
        boolean isLoginTrue=!blueRentalPage.loginVerify.getText().equals("login");
        Assert.assertTrue(isLoginTrue);
        //2. doğrulama şekli
        Assert.assertFalse(blueRentalPage.loginVerify.getText().equals("login"));
    }

    @And("verilen email ve password ile login olur")
    public void verilenEmailVePasswordIleLoginOlur(DataTable dataTable) {
        List<List<String>> emailPassword = dataTable.asLists();
        System.out.println("emailPassword = " + emailPassword);
        /*
         emailPassword = [[email, password],
         [sam.walker@bluerentalcars.com, sami],
         [john_doe@gmail.com, johndoe],
         [johnson@bluerentalcars.com, johnson]]
         */
        //emailPassword.get(0)[email, password]
        for (int i = 1; i <emailPassword.size() ; i++) {
            String email=emailPassword.get(i).get(0);
            String password=emailPassword.get(i).get(1);
            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password,Keys.ENTER);
            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();
        }
        //2.yolu
        for (int i = 1; i <dataTable.asLists().size() ; i++) {
            String email=dataTable.row(i).get(0);
            String password=dataTable.row(i).get(1);

            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password,Keys.ENTER);
            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();
        }
    }

    @And("exceldeki {string} sayfasındaki  kullanici bilgileri ile login olur")
    public void exceldekiSayfasındakiKullaniciBilgileriIleLoginOlur(String sayfaIsmi) {
        String dosyaYolu="src\\test\\resources\\adminTestData.xlsx";
        ExcelReader excelReader = new ExcelReader(dosyaYolu,sayfaIsmi);
        for (int i = 1; i < excelReader.rowCount() ; i++) {
            String email=excelReader.getCellData(i, 0);
            String password=excelReader.getCellData(i, 1);
            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password,Keys.ENTER);
            ReusableMethods.bekle(1);
            Driver.getDriver().navigate().back();
            ReusableMethods.bekle(1);
        }
    }
}
