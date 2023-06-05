package StepDef;

import org.openqa.selenium.WebDriver;

import DriverFactory.MyKabinDriverFactory;
import PageObject.AssetPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssetSteps {

	private AssetPage assetPage = new AssetPage(MyKabinDriverFactory.getDriver());
	
	@Given("Admin on Login Page")
	public void admin_on_login_page() {
		MyKabinDriverFactory.getDriver().get("http://openteqdev.com/mycabin_dev/login/");
	}


	@When("Admin enter below credentials")
	public void admin_enter_below_credentials(DataTable dataTable) {
	    assetPage.enterDetails(dataTable);
	}

	@When("click on Logn")
	public void click_on_Logn() {
		assetPage.pressLog();
	}
	
	@Then("Verify admin login successfully")
	public void Verify_admin_login_successfully() {
		assetPage.loginValidation();
	}
	
	@When("Search the asset {string}")
	public void search_the_asset(String string) {
	   
	}

	@Then("update the Asset Status")
	public void update_the_asset_status() {
	   
	}


	@Then("Delete the Updated asset")
	public void delete_the_updated_asset() {
	    
	}
}
