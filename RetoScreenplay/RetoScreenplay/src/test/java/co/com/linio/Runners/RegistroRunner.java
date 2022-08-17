package co.com.linio.Runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/Registro.feature",
        glue = "co.com.linio.StepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)



public class RegistroRunner {



}
