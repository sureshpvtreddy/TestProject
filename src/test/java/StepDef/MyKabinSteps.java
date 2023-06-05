package StepDef;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;

import DriverFactory.MyKabinDriverFactory;
import PageObject.MyKabinLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyKabinSteps {
	
	private static String title;
	
	private MyKabinLoginPage myKabinLoginPage = new MyKabinLoginPage(MyKabinDriverFactory.getDriver());
	
	@Given("user is on LoginPage")
	public void user_is_on_login_page() {
		MyKabinDriverFactory.getDriver().get("http://openteqdev.com/mycabin_dev/login");

	    
	}

	@When("user enter username {string}")
	public void user_enter_username(String username) {
	    myKabinLoginPage.enterUserName(username);
	}

	@When("user enter password {string}")
	public void user_enter_password(String password) {
		myKabinLoginPage.enterPassword(password);
	    
	}

	@Then("user click on Login button")
	public void user_click_on_login_button() {
		myKabinLoginPage.clickOnLogin();
	   
	}
//	@Then ("Verifying Dashboard page Opened or not")
//	public void Verifying_Dashboard_page_Opened_or_not() {
//		myKabinLoginPage.verifyingDashboardPageOpenedOrNot();
//	}
//		title = myKabinLoginPage.getLoginPageTitle();
//		System.out.println("login page title is: " + title);
//	Assert.assertTrue(title.contains(expectedTitleName));
//	}
	//****************************************
	@When("Click on Users Management")
	public void click_on_users_management() {
		myKabinLoginPage.clickOnUserManagement();
	}

	@Then("verify Title of the User Management page")
	public void verify_title_of_the_user_management_page() {
		myKabinLoginPage.getPageTitle();
	}

//	@Then("Click on Add button")
//	public void click_on_add_button() {
//		myKabinLoginPage.
//	    
//	}
//
//	@Then("verify title of the Adding page")
//	public void verify_title_of_the_adding_page() {
//	    
//	}
//
//	@When("user enters UserName")
//	public void user_enters_user_name() {
//	    
//	}
//	@When("user enter emailId")
//	public void user_enter_emailId() {
//	    
//	}
//	@When("Enter mobile number")
//	public void enter_mobile_number() {
//	    
//	}
//
//	@When("enter password")
//	public void enter_password() {
//	   
//	}
//
//	@When("enter Address")
//	public void enter_address() {
//	    
//	}
//
//	@When("Click on Status")
//	public void click_on_status() {
//	    
//	}
//
//	@When("Click on status is Active")
//	public void click_on_status_is_active() {
//	    
//	}
//
//	@Then("Click on Save Changes")
//	public void click_on_save_changes() {
//	   
//	}
}


