package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", //Localização das funcionalidades//
        tags = "@loginEsquema",
        glue = "steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class RunnerTest {
}
