package step_Def;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import drivers.Driver_Factory;

public class Hooks {

    Driver_Factory driver_factory= new Driver_Factory();

    @Before
    public void setUp(){
        driver_factory.openBrowser();
        driver_factory.navigate("http://www.argos.co.uk");
        driver_factory.maximixeBrowser();
        driver_factory.applyImplicitWait();
    }

    @After
    public void tearDown(){
    driver_factory.closeBrowser();
    }
}