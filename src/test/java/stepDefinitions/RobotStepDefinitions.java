package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.RobotPage;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotStepDefinitions {
    RobotPage robotPage = new RobotPage();
    @Test
    public void robotClassTest() throws AWTException {
        Robot robot =new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.delay(3000);

    }


    @When("yuklenmek istenen dosyayi yukler")
    public void yuklenmek_istenen_dosyayi_yukler() {
        robotPage.selectButton.click();
        ReusableMethods.uploadFilePath("\"C:\\Users\\alika\\Downloads\\Batch189upload.pdf\"");
    }
    @Then("dosyanin basariyla yuklendigini test eder")
    public void dosyanin_basariyla_yuklendigini_test_eder() {
        Assert.assertTrue(robotPage.verify.isDisplayed());
    }

}
