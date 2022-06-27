package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import util.DriverUtil;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"./src/test/resources"},
        tags = "@Test or @Explore or @Search",
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
