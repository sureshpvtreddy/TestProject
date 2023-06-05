package StepDef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import DriverFactory.MyKabinDriverFactory;
import PageObject.DashBoardPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps {
	private WebDriver driver;
	private static String title;
	// incase manaki DashBoardPage import option chupinchakapote ikkada "new" ni
	// remove chesi import chesukunna taruvata marala "new" ani ivvali
	private DashBoardPage dashBoardPage = new DashBoardPage(MyKabinDriverFactory.getDriver());

	@Given("user is already on login page")
	public void user_is_already_on_login_page() {
		MyKabinDriverFactory.getDriver().get("http://openteqdev.com/mycabin_dev/login");

	}

	@When("enter user name {string}")
	public void enter_user_name(String username) {
		dashBoardPage.enterUserName(username);

	}

	@Then("enter password {string}")
	public void enter_password(String password) {
		dashBoardPage.enterPassword(password);

	}

	@Then("click on login")
	public void click_on_login() {
		dashBoardPage.clickOnLogin();
	}

	@Then("Validate Page Title {string}")
	public void Validate_Page_Title(String expectedTitleName) {
		title = dashBoardPage.getDashBoardPageTitle();
		System.out.println("loginpage title is: " + title);
		Assert.assertTrue(title.contains(expectedTitleName));

	}

	@Then("Forgot password link is Exist or not")
	public void Forgot_password_link_is_Exist_or_not() {
		dashBoardPage.isForgotPwdLinkExist();

	}

	@Then ("Validation Alert Message {string}")
	public void validation_alert_message (String name) {
		dashBoardPage.verifyLogMessage();
	}
		
//	}

	// need to check below code

//	 public void verifyResult(Scenario scenario) {
//	        // Perform result verification
//
//		 if (/* condition for warning */) {
//	            String warningMessage = "Please check login credentials.";
//	            scenario.write(warningMessage);
//
//	            Assert.assertTrue("Warning message is not displayed.", isWarningMessageDisplayed(scenario, warningMessage));
//	        }
//	    }
//
//	    private boolean isWarningMessageDisplayed(Scenario scenario, String warningMessage) {
//	        String scenarioLog = scenario.toString();
//	        return scenarioLog.contains(warningMessage);
//	    }

//	@When("user Enters following user details")
//	public void user_enters_following_user_details(DataTable dataTable) {
//		List<List<String>> userList = dataTable.asLists(String.class);
//		for (List<String> e : userList) {
//			System.out.println(e);
//		}
//	}

	// [Setup ki ee https://www.youtube.com/watch?v=oAure-GrqJQ link video chudali]
	@When("user Enters {string} And {string}")
	public void user_Enters_and(String string, String string2) {
		dashBoardPage.enterFollowingData(string, string2);
	}
	@When ("Verify login page")
	public void Verify_login_page() {
		dashBoardPage.vefrifyPage();
		
	}
}
