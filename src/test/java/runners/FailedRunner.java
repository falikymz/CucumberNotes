package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//==> console da scenariolar hakkında ayrıntılı bilgi verir
                "html:target/default-cucumber-reports.html",
                  "json:target/json-reports/cucumber.json",
                  "junit:target/xml-report/cucumber.xml",
                  "rerun:TestOutput/failed_scenario.txt"
        },
        features = "@TestOutput/failed_scenario.txt",
        glue = {"stepDefinitions","hooks"},
        dryRun = false,
        monochrome=false
)
public class FailedRunner {
    /*

    rerun plugini ile fail olan scenarioları burada belirtmiş olduğumuz failed_scenario.txt dosyasi icinde tutabiliriz
        BU classda sadece dail olan test sceanrioları çalıştıracağız
        Sadece txt dosyasında fail olan scenariolar calistiralacğı icin tags parametresine gerek yoktur
     */
}
