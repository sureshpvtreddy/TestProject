package StepDef;

import java.util.List;
import java.util.Map;

import DriverFactory.MyKabinDriverFactory;
import PageObject.HostBizPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HostBizSteps {

	private HostBizPage hostBizPage = new HostBizPage(MyKabinDriverFactory.getDriver());

	@Given("user is in LoginPage")
	public void user_is_in_login_page() {
		MyKabinDriverFactory.getDriver().get("http://openteqdev.com/mycabin_dev/login");

	}

	@When("user enter Login Details")
	public void user_enter_login_details(DataTable dataTable) {
		hostBizPage.enterAdminDetails(dataTable);
	}

	@When("click on Login")
	public void click_on_Login() {
		hostBizPage.clickOnLoginBtn();
	}

	@Then("click on HostBiz Management")
	public void click_on_host_biz_management() {
		hostBizPage.clickOnHostMan();
	}

	@When("click on AddBtn")
	public void click_on_AddBtn() {
		hostBizPage.clickOnAdd();
	}

	@When("click on Scroll down")
	public void click_on_scroll_down() {
		hostBizPage.scrollDown();
	}

	@When("enter the below details")
	public void enter_the_below_details(DataTable dataTable) {
		hostBizPage.enterHostBizDetails(dataTable);
	}

	@Then("click on Save butoon")
	public void click_on_Save_butoon() {
		hostBizPage.clickSave();
	}

	@Given("Hostbiz on login Page")
	public void hostbiz_on_login_page() {
		MyKabinDriverFactory.getDriver().get("https://openteqdev.com/mycabin_dev/login/");
		;
	}

	@When("Enter {string} And {string}")
	public void enter_and(String string, String string2) {
		hostBizPage.HostLoginCredentials(string, string2);
	}

	@When("click on LoginBtn")
	public void click_on_login_btn() {
		hostBizPage.HostLog();

	}

	@Then("verify HostBiz Dashboard page")
	public void verify_host_biz_dashboard_page() {
		hostBizPage.VerifySuccess();
	}

	@Then("click on Logout")
	public void click_on_logout() {
		hostBizPage.hLogout();
	}

	@Then("Verify Logout Sucessful")
	public void Verify_Logout_Sucessful() {
		hostBizPage.verifyLogoutSucess();
	}
}
