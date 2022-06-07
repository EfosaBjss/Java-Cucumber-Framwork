package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import util.DriverUtil;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"./src/test/resources"},
        tags = "@Test",
        glue = {"steps"},
        monochrome = true
)

public class RunnerClass {

    @BeforeClass
    public static void startSession(){
        DriverUtil driverUtil = new DriverUtil();
        driverUtil.setDriver("Chrome");
    }
}