package StepDefinitions;

import AppPages.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void launchBrowser() throws Throwable {

        TestBase.launchBrowser();
    }

    @After
    public void tearDown(){
        TestBase.tearDown();
    }
}
