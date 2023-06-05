package StepDef;

import DriverFactory.MyKabinDriverFactory;
import PageObject.HostLoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HostLoginSteps {

	private HostLoginPage hostLoginPage = new HostLoginPage(MyKabinDriverFactory.getDriver());

	@Given("Hostbiz on Login page")
	public void hostbiz_on_login_page() {
		MyKabinDriverFactory.getDriver().get("http://openteqdev.com/mycabin_dev/login");
	}

	@When("enter Valid Credentials")
	public void enter_Valid_Credentials(DataTable dataTable) {
		hostLoginPage.HostValidData(dataTable);
	}

	@Then("Click on Forgot Passsword")
	public void Click_on_Forgot_Passsword() throws InterruptedException {
		hostLoginPage.clickForgot();
		Thread.sleep(3000);
	}

	@When("click on Dismis Forgot Password popup")
	public void click_on_Dismis_Forgot_Password_popup() {
		hostLoginPage.dismisForgot();
	}

	@When("Enter mail {string}")
	public void Enter_mail(String HostEmail) {
		hostLoginPage.enterEmail();
	}

	@When("click on Send")
	public void click_on_Send() {
		hostLoginPage.clickOnSend();
	}

	@When("Verfiy All SubModules")
	public void Verfiy_All_SubModules() throws InterruptedException {
		hostLoginPage.VerifySubmodules();
		Thread.sleep(3000);
	}

	@When("click on Dashboard")
	public void click_on_Dashboard() throws InterruptedException {
		hostLoginPage.DashBData();
		Thread.sleep(3000);
	}

	@Then("click on Categories")
	public void click_on_Categories() {
		hostLoginPage.ClickOnCat();

	}

	@When("Click on Add")
	public void Click_on_Add() {
		hostLoginPage.ClicKonAdd();
	}

	@When("Enter the following Data")
	public void Enter_the_following_Data(DataTable dataTable) {
		hostLoginPage.EnterCatData(dataTable);
	}

	@When("click on SAVE Changes")
	public void click_on_SAVE_Changes() {
		hostLoginPage.ClickOnSave();
	}

	@When("click on Search and Pass the Category Value")
	public void click_on_Search_and_Pass_the_Category_Value(DataTable dataTable) {
		hostLoginPage.SearchValue(dataTable);
	}

	@When("click on Edit")
	public void click_on_Edit() {
		hostLoginPage.Edit();
	}

	@Then("Update the Existed Data with below data")
	public void Update_the_Existed_Data_with_below_data(DataTable dataTable) {
		hostLoginPage.UpdateCatData(dataTable);
	}

	@Then("Change the Status Active Or Inactive")
	public void Change_the_Status_Active_Or_Inactive(DataTable dataTable) {
		hostLoginPage.changStatus(dataTable);
	}
	@Then("Search data and Delete that Data")
	public void Search_data_and_Delete_that_Data(DataTable dataTable) {
		hostLoginPage.Delete(dataTable);
	}
	@When("click on Cancel On Delete PopUp")
	public void click_on_Cancel_On_Delete_PopUp() {
		hostLoginPage.cancelOnPopUp();
		
	}
	@When("Click on Yes Delete")
	public void Click_on_Yes_Delete() throws InterruptedException {
		hostLoginPage.DeleteOnPopUp();
		Thread.sleep(1000);
	}
	
	@When("click on AssetManagement")
	public void click_on_AssetManagement() {
		hostLoginPage.clickOnAsset();
		
	}
	@When("Click on Add Asset button")
	public void Click_on_Add_Asset_button() {
		hostLoginPage.AddAssetButton();
		
	}
	
		@When("Add Assest {string} And {string}")
		public void add_assest_and_in_active(String Name, String status) throws InterruptedException  {
			hostLoginPage.AddAssets(Name, status);
			Thread.sleep(3000);
	}
		@When("pass the data in Search field {string}")
		public void pass_the_data_in_search_field(String Search1) {
			hostLoginPage.SearchValue(Search1);
	}
		@And("Change the Status")
		public void Change_the_Status() {
			hostLoginPage.switchStatus();
		}
		
	@Then("pass the data in Search field Delete {string}")
	public void pass_the_data_in_Search_field_Delete(String Search2) {
		hostLoginPage.SearchAsset(Search2);
		
	}
	@And("Click on Delete button")
	public void Click_on_Delete_button() throws InterruptedException {
		hostLoginPage.ClickDelete();
		Thread.sleep(1000);
	}
	@Then("Click on Yes Delete btn")
	public void Click_on_Yes_Delete_btn() throws InterruptedException {
		hostLoginPage.ClickYes();
		Thread.sleep(1000);
	}
	
	// Menu'S Management 
	
	@When ("Click on Menu Management")
	public void Click_on_Menu_Management() {
		hostLoginPage.clickMenuMa();
	}
	@And ("click on Add MenuBtn")
	public void click_on_Add_MenuBtn() {
		hostLoginPage.clickAddMenu();
	}
	@When("Enter the Following Details and Save")
	public void enter_the_following_details_and_Save(DataTable dataTable) {
		hostLoginPage.EnterTheBelow(dataTable);
	}
	@When("Click on Edit Menu Management")
	public void Click_on_Edit_Menu_Management() {
		hostLoginPage.editMenu();
	}
	@And("Update with the following Details and Save")
	public void Update_with_the_following_Details_and_Save(DataTable dataTable) {
		hostLoginPage.UpdateMenu(dataTable);
	}
	@And("Switch Status")
	public void Switch_Status() {
		hostLoginPage.switchSta();
	}
	
	// Booking Management
	
	@When("click On Booking Management")
	public void click_On_Booking_Management() {
		hostLoginPage.clickBooking();
		
	}
	@And("search the data {string}")
	public void search_the_data(String CabinType) {
		hostLoginPage.searchBooking(CabinType);
	}
	@When("click on View Booking And Click on Back")
	public void click_on_view_booking_and_click_on_back() {
		hostLoginPage.viewBooking();
	}
	@And("get Booking Table data")
	public void get_Booking_Table_data() {
		hostLoginPage.getBookingTableData();
		
	}
	@And("search for the data {string}")
	public void search_for_the_data(String name) {
		hostLoginPage.searchSpecific(name);
	}
	@And("Get specific Data")
	public void Get_specific_Data() {
		hostLoginPage.getSpecificData();
	}
	
	@When("Go to Profile Page and Get Profile Information")
	public void Go_to_Profile_Page_and_Get_Profile_Information() {
		hostLoginPage.profilePage();
		
	}
	
	@And("click on Profile Edit and Pass Below Details and Save")
	public void click_on_Profile_Edit_and_Pass_Below_Details_and_Save(DataTable dataTable) {
		hostLoginPage.updateProfile(dataTable);
	}
	@And("Select the Date")
	public void Select_the_Date() {
		hostLoginPage.enterDate();
	}
	@And("Update Password by giving below details")
	public void Update_Password_by_giving_below_details(DataTable dataTable) {
		hostLoginPage.UpdatePWD(dataTable);
	}
	
	@And("Update Password")
	public void Update_Password(DataTable dataTable) {
		hostLoginPage.UpdatePWD(dataTable);
	}
	@And("Logout")
	public void Logout() {
		hostLoginPage.Logout();
	}
	@When("give the date {string} And {string} And {string}")
	public void give_the_date_and_and(String exDay, String exMonth, String exYear) {
		hostLoginPage.selectDate(exDay, exMonth, exYear);
	}
}

