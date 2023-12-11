package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",},
        features ="src/test/resources/mobileFeature",
        glue = "stepdefinitions",
        tags = "@browser",
        dryRun =false
        // Eger ki dry run true ise : Features dosyalarinda yazmis oldugumuz eksik test steplerini belirlemek icin
        // verilen TAG namelerine ait olan seneryolarin eksik adimlarini belirler
        // eger ki eksik adiminiz yok ise : Test passed olur ama bu passed yazilan kodlarin passed oldugu degil
        // eksik adimlarin olmadigi anlamina gelmektedir.

        // Eger ki dry run false ise : tanimlanan eksik adimlardan sonra ilgili seneryolarin tanimlanmis TAG name i olan
        // seneryolarini harakete gecirip verilen emirleri test olarak kosturur.
)




public class Runner {


}
