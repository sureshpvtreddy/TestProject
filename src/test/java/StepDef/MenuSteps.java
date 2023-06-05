package StepDef;

import DriverFactory.MyKabinDriverFactory;
import PageObject.MenuPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MenuSteps {

	private static String title;

	private MenuPage menuPage = new MenuPage(MyKabinDriverFactory.getDriver());

	@Then("Click on MenuManagement")
	public void Click_on_MenuManagement() {
		menuPage.clickOnMenuManage();
		
	}

	@Then("click on search button")
	public void click_on_search_button() {
		menuPage.clickOnSearch();
	}

	@Then("enter the {string}")
	public void enter_the(String string) {
		menuPage.enterName(string);

	}

	@Then("click on edit")
	public void click_on_edit() {
		menuPage.clickOnEdit();
		
	}

	

	@Then("Click on Category and choose {string}")
	public void Click_on_Category_and_choose(String string)  {
		menuPage.selectCategory(string);
		
	}

	@Then("enter Menu Name {string}")
	public void enter_Menu_Name(String string) {
		menuPage.menu(string);
		
	}

	@Then("enter Cost {string}")
	public void enter_Cost(String string)  {
		menuPage.cost(string);
		
	}

	@Then("enter Description {string}")
	public void enter_Description(String string) {
		menuPage.description(string);
		
	}

	@Then("scroll Down")
	public void scroll_Down() {
		menuPage.Scroll();
	}
	
	@Then("change the status")
	public void change_the_status() {
		menuPage.updateStatus();
		
	}

	@Then("click on SaveChanges")
	public void click_on_save_changes() {
		menuPage.save();
		
	}
}
