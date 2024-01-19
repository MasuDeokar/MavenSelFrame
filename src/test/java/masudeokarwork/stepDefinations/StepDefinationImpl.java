package masudeokarwork.stepDefinations;

import java.io.IOException;

import io.cucumber.java.en.Given;
import masudeokar.TestComponents.BaseTest;
import pageObject.masudeokarwork.SeleniumFrameworkDesign.LandingPage;


public class StepDefinationImpl extends BaseTest {
	
	public LandingPage landingPage;
	@Given("I landed on Ecommerce Page")
	public void I_landed_on_Ecommerce_Page() throws IOException
	{
		landingPage =launchApplication();
	}
	@Given ("^Logged in with username<.+> and password <.+>$")
	public void  logged_in_userName_and_password(String username, String password)
	{
		
	}
}
