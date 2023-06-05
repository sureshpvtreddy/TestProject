package StepDef;

import DriverFactory.MyKabinDriverFactory;
import PageObject.UsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class UserSteps {
	private WebDriver driver;
	private WebDriverWait wait;
	private UsersPage usersPage = new UsersPage(MyKabinDriverFactory.getDriver());
	
	@Given("when user on login page")
	public void when_user_on_login_page() {
		MyKabinDriverFactory.getDriver().get("http://openteqdev.com/mycabin_dev/login");
		
		
	}
	
	@When("enter Admin name {string}")
	public void enter_Admin_name(String username) {
		usersPage.enterAdminName(username);
		
		
	}
	@Then("enter Admin password {string}")
	public void enter_Admin_password(String password){
		 usersPage.enterAdminPassword(password);
		
	}
	
	@Then("Admin click on login")
	public void Admin_click_on_login() {
		usersPage.clickOnLogin();
	}
	@When("click on Users management")
	public void click_on_Users_management() { 
		usersPage.clickOnUsersManagement();
	
	}
	
	@Then("click on Add")
	public void click_on_Add() {
		usersPage.clickOnAdd();
	}
	
	
	@And("enter new user name {string}")
	public void enter_new_user_name(String name) {
		usersPage.enterUserName(name);
	
	}
	
	@Then("click on Choose file path {string}")
	public void click_on_Choose_file_path(String imagePath) {
		usersPage.clickOnChooseFile(imagePath);
	   
	  
	   
	}
	
	@And("enter email {string}")
	public void enter_email(String email) {
		usersPage.enterEmail(email);
		
	}
	@And("enter mobile number {string}")
	public void enter_mobile_number(String Mobile) {
		usersPage.enterMobile(Mobile);
		
	}
	@And("enter User password {string}")
	public void enter_User_password(String pwd) {
		usersPage.enterPassword(pwd);
	}
	@And("enter Address {string}")
	public void enter_Address(String Address) {
		usersPage.enterAddress(Address);
	}
	@Then("Click on Save Changes")
	public void Click_on_Save_Changes() throws InterruptedException {
		usersPage.ClickOnSaveChanges();
		Thread.sleep(1000);
		
}
	@Then("verify sucess messages {string}")
	public void verify_sucess_messages(String Smessage) {
		usersPage.SucessMessage();
		
	}
	@Then("click on Edit button")
	public void click_on_Edit_button()  {
		usersPage.Edit();
		
	}
	
	// how to clear all text field data at a time......?
	
	@Then("clear all data")
	public void clear_all_data() throws InterruptedException {
		usersPage.Clear();
	Thread.sleep(2000);
	}
	
//	@Then("clear Address")
//	public void clear_Address() throws InterruptedException {
//		usersPage.clearAdrress();
//		Thread.sleep(2000);
//	}
	@Then("Update user details")
	public void Update_user_details() throws InterruptedException {
		usersPage.updateUserDetails();
		Thread.sleep(2000);
	}
	
	
	
	@Then("Delete User")
	public void Delete_User() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		usersPage.Delete();
		Thread.sleep(1000);
		
	}
	@Then("Click on Yes Delete It")
	public void Click_on_Ye_Delete_It() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		usersPage.DeleteYes();
		Thread.sleep(1000);
		
		}
@Then("Click on Cancel")
public void Click_on_Cancel() {
	usersPage.ClickOnCancel();
	
}
	@Then("Click on Search")
	public void Click_on_Search() {
		usersPage.clickOnSearch();
	}
//@Then("Enter the Data {string}")
//public void Enter_the_Data(String niha) {
//	
//}
	@Then("change the Status by clicking on Status button")
	public void change_the_Status_by_clicking_on_Status_button() throws InterruptedException {
		usersPage.clickOnStatus();
		Thread.sleep(1000);
}
	@Then("click on Reports")
	public void click_on_Reports() throws InterruptedException {
		usersPage.reports();
		Thread.sleep(2000);
	}
}
