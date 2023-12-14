package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                  "json:target/json-reports/cucumber.json",
                  "junit:target/xml-report/cucumber.xml"  },
        features = "src/test/resources/features/",
        glue = "stepDefinitions",
        tags = "@US010",
        dryRun = false,
        monochrome=false
)
public class Runner {
    /*
    Runner class body içinde bir şey yazılmaz
    Runner classinda önemli olan 2 tane annotation vardır
    1)@RunWith ==>Runner clasimiza çalışma özelliği verdi
    2)@CucumberOptions==> parantezi içinde hangi testleri çalıştıracağımzı,
    hangi raporları alacağımızı ,feature ve glue parametreleri ile bu dosyaların
    pathleri gibi test ayrıtılarını tanımlarız ve bazı pluginleri ekleyebiliriz
    dryRun=true ==> iken feature file daki test senaryolarını çalıştırmadan eksik
    stepDefiniton i olup olmadığını kontrol eder , browseri çalıştırmaz

     */
}
