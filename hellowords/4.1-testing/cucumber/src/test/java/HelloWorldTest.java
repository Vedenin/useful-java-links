import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *  To run using "maven test"
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class HelloWorldTest {
}
