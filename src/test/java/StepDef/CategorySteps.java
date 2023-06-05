package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import DriverFactory.MyKabinDriverFactory;
import PageObject.CategoryPage;
import PageObject.UsersPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategorySteps {

	private WebDriver driver;
	private WebDriverWait wait;
	private CategoryPage categoryPage = new CategoryPage(MyKabinDriverFactory.getDriver());

	@Then("click on Category management")
	public void click_on_category_management() {
		categoryPage.clickOnCategory();
	}

	@When("click on Search button")
	public void click_on_Search_button() {
		categoryPage.clickOnSearch();
	}

	@When("Enter Category Name {string}")
	public void Enter_Category_Name(String name) {
		categoryPage.enterCatName(name);
	}

	@When("click on Edit Category")
	public void click_on_edit_category() throws InterruptedException {
		categoryPage.clickOnEdit();
		Thread.sleep(5000);
		
	}

	@When("clear and updated Category name {string}")
	public void clear_and_updated_Category_name(String name) throws InterruptedException {
		categoryPage.updateCat(name);
		Thread.sleep(1000);
	}

	@When("click on Status Dropdown and Choose Status")
	public void click_on_Status_Dropdown_and_Choose_Status() throws InterruptedException {
		categoryPage.clickOnStatus();
		Thread.sleep(5000);
	}


	@When("click on Save Changes")
	public void click_on_Save_Changes() throws InterruptedException {
		categoryPage.clickOnSaveChanges();
		Thread.sleep(5000);
	}

	@When("Search Latest updated Category")
	public void Search_Latest_updated_Category() {
		categoryPage.searchLatest();
	}

	

	@When("Verify Status is Active or InActive")
	public void Verify_Status_is_Active_or_InActive() {
		categoryPage.verify();
	}

	@When("click on status")
	public void click_on_status() {
categoryPage.changeStatus();
	}

	@When("Click on Delete")
	public void click_on_Delete() {

	}
}