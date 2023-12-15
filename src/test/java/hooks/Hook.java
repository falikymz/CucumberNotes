package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hook {

    /*
    hooks classi ile scenariolardan once veya sonra calismasini istedigimiz kodları
     io.cucumber.java.After methodları sayesinde yaparız
     Eger sadece istedigimiz scenariodan once calismasini istedigimiz bir kod olursa @before notasyonu parantezi
     içine tagi belirtiriz
      Eger sadece istedigimiz scenariodan once calismasini istedigimiz bir kod olursa @after notasyonu parantezi
     içine tagi belirtiriz
     dolayısıyla bu sekilde sadece tagi belirttiğimiz scenariodan once veya sonra calistirilir
     */
    @Before
    public void setUp() throws Exception {
        System.out.println("Hook classindaki @Before methodu her test scenariosundan önce çalıştırılır");
    }
    @Before("@honda")
    public void setUp2() throws Exception {
        System.out.println("Sadece @honda tagi olan scenariolardan önce çalıştırılır");
    }
    @After("@audi")
    public void tearDown2() throws Exception {
        System.out.println("Sadece @honda tagi olan scenariolardan sonra çalıştırılır");
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            TakesScreenshot ts= (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/png","scenario"+scenario.getName());
            Driver.closeDriver();
        }
    }
}
