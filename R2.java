package Runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features="Features",
glue="Step_Definations")
public class R2 extends AbstractTestNGCucumberTests{

}
