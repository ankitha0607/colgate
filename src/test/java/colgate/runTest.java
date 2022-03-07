package colgate;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
        features = "C:\\Users\\ANKITHA\\Desktop\\java-selenium\\colgate\\src\\test\\java\\colgate\\featurefile.feature",
        //tags = "@Test1 or @Test2",
        glue = "/colgate"
        
        
		)

public class runTest {

	
}
