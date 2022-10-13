package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PerformAdditon {

    @Given("Two numbers")
    public void Two_numbers(){

        System.out.println("Addition performed");
    }

    @Then("perform addition")
    public void perform_addition(){

        System.out.println("Addition performed successfully");
    }
}
