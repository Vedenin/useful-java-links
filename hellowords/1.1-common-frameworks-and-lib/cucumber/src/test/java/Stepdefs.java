import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 *  To run using "maven test"
 */
public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) seconds$")
    public void i_wait_hour(int arg1) throws Throwable {
        Thread.sleep(10000);
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
        System.out.println("My belly growl");
    }

    @Then("^I say Hello World!$")
    public void i_say_Hello_World() throws Throwable {
        System.out.println();
        System.out.println("Hello World!");
    }

}
