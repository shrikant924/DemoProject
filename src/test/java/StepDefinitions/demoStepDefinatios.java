package StepDefinitions;

import io.cucumber.java.en.*;

public class demoStepDefinatios {

    @Given("feature files")
    public void feature_files() {

        System.out.println("this method is aligned with background keyword");

    }
    @When("we execute the feature files")
    public void we_execute_the_feature_files() {

        System.out.println("we execute the feature files");
    }
    @Then("it will run test cases")
    public void it_will_run_test_cases() {
        System.out.println("it will run test cases");
    }
    @But("feature should be glue with steps definitions")
    public void feature_should_be_glue_with_steps_definitions() {
        System.out.println("feature should be glue with steps definitions");
    }
    @And("Internet connection should be proper")
    public void internet_connection_should_be_proper() {
        System.out.println("Internet connection should be proper");
    }



}
