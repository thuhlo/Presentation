import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@RunWith(SerenityRunner.class)
@CucumberOptions(
        features="src/test/resources/", glue = "Steps"
)

public class Runner
{
}
