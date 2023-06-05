package PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;

public class HostLoginPage {

	private WebDriver driver;

	// Locators
	public By Email = By.xpath("//div[@class='md-input-wrapper']/input[@type='email']");
	public By password = By.xpath("//div[@class='md-input-wrapper']/input[@type='password']");
	private By login = By.xpath("//*[@id=\"insert_login_form\"]/div[5]/div[1]/button");

	public By ForogotPwd = By.cssSelector("a[href='javascript:']");
	public By ForgotEmail = By.xpath("//div[@class='modal-body']/input[@type='email']");
	public By ForogotDismis = By.xpath("//button[@class='close']");
	public By ForgotSend = By
			.xpath("//button[@class='btn btn-primary btn-md btn-block waves-effect text-center insert_email']");
	public By InvalidData = By.xpath("//span[text()='Please check login credentials']");
	public By DashB = By.xpath("//i[@class='fa fa-tachometer']");
	public By Catgories = By.xpath("//span[text()=' Categories']");
	public By Assets = By.xpath("//span[text()='Assets Management']");
	public By Menu = By.xpath("//span[text()=\"Menu's Management\"]");
	public By Booking = By.xpath("//span[text()='Bookings Management']");
	public By TotalUsers = By.xpath("//div/div/a/i[@class='fa fa-users ']");
	public By TotalBook = By.xpath("//h3[text()='Total Bookings']");
	public By TotalHost = By.xpath("//h3[text()='Total Hostbiz']");
	public By TotalAsset = By.xpath("//h3[text()='Total Assets']");

	private By AddB = By.xpath("//button[@class='btn btn-primary fa fa-plus text-right add_category']");
	private By CatName = By.xpath("//input[@type='text']");
	private By status = By.xpath("//select[@name='data[status]']");
	private By Save = By.xpath("//button[text()='Save changes']");
	private By search = By.xpath("//input[@type='search']");
	private By Edit = By.xpath("//i[@class='fa fa-pencil']");
	private By StaActive = By.xpath("//span[@data-status='1']");
	private By StaInactive = By.xpath("//span[@data-status='0']");
	private By Delete = By.xpath("//i[@class='fa fa-trash text-danger']");
	private By Cancel = By.xpath("//button[text()='Cancel']");
	private By YesDelete = By.xpath("//button[text()='Yes, delete it!']");

	private By AssteMan = By.xpath("//span[text()='Assets Management']");
	private By AddAsset = By.xpath("//button[@class='btn btn-primary fa fa-plus text-right add_assets']");
	private By CabinDrop = By.xpath("//div[@class='col-sm-9']/select[@type='text']");
	private By Compact = By.xpath("//option[text()='Compact']");
	private By Team = By.xpath("//option[text()='Team']");
	private By Party = By.xpath("//option[text()='Party']");
	private By AssetSta = By.xpath("//select[@name='data[status]']");
	private By Active = By.xpath("//option[text()='Active']");
	private By Inactive = By.xpath("//option[text()='Inactive']");
	private By CloseAsset = By.xpath("//span[text()='×']");
	private By ClosePop = By.xpath("//button[@class='close']");

	// Menu'Management

	private By MenuMa = By.xpath("//span[text()=\"Menu's Management\"]");
	private By MenuAdd = By.xpath("//button[text()='Add']");
	private By CateDrop = By.xpath("//select[@name='data[category_id]']");
	private By MenuName = By.xpath("//input[@name='data[name]']");
	private By MenuCost = By.xpath("//input[@name='data[cost]']");
	private By MenuDes = By.xpath("//body[@contenteditable='true']");
	private By MenuSave = By.xpath("//button[@type='button']");
	private By EditMenu = By.xpath("//i[@class='fa fa-pencil']");
	private By MenuStaInactive = By.xpath("//span[text()='InActive']");

	// Booking Management
	private By clickBook = By.xpath("//span[text()='Bookings Management']");
	private By BookSearch = By.xpath("//input[@type='search']");
	private By ViewBook = By.xpath("//i[@class='fa fa-eye']");
	private By BackBtn = By.xpath("//button[text()='Back']");
	private By viewBookPage = By.xpath("//form[@id='view_booking']");
	private By userName = By.cssSelector("input[name='data[user_id]']");
	private By BookID = By.xpath("//input[@name='data[booking_id]']");
	private By HostName = By.xpath("//input[@name='data[hostbiz_id]']");
	private By CabinName = By.xpath("//input[@name='data[name]']");
	private By Location = By.xpath("//textarea[@name='data[location]']");
	private By BookingType = By.xpath("//input[@name='data[booking_type]']");
	private By Frequency = By.xpath("//input[@name='data[frequency]']");
	private By startDate = By.xpath("//input[@name='data[start_date]']");
	private By EndDate = By.xpath("//input[@name='data[end_date]']");
	private By MeetingAgenda = By.xpath("//textarea[@name='data[meeting_agenda]']");
	private By Attendees = By.xpath("//input[@name='data[no_attendees]']");
	private By Bookstatus = By.xpath("//input[@name='data[status]']");

	private By BookTable = By.xpath("//div[@class='card-block table-responsive']");
	private By TableRows = By.xpath("//tr[@role='row']");
	private By TableColumns = By.xpath("//tr/th[@colspan='1']");

	private By specificData = By.xpath("//tr[@role='row']");
	private By specificName = By.xpath("//td[contains(. , 'chai')]");
	// Profile
	private By Profile = By.xpath("//span/img[@alt='User Image']");
	private By profileIcon = By.xpath("//i[@class='icon-user']");
	private By proText = By.xpath("//div[@class='card-block']");
	private By proEdit = By.xpath("//i[@class='icofont icofont-edit']");
	private By ProName = By.xpath("//input[@name='data[full_name]']");
	private By DOB = By.xpath("//input[@name='data[dob]']");
	private By DatePicker = By.cssSelector(".dtp-picker-calendar");
	private By PassDate = By.cssSelector(".dtp-select-day");
	private By Calclear = By.xpath("//button[text()='Clear']");
	private By Calcancel = By.xpath("//button[text()='Cancel']");
	private By CalOK = By.xpath("//button[text()='OK']");
	private By CalClose = By.xpath("//i[@class='fa fa-close']");
	private By ProAddress = By.xpath("//textarea[@name='data[address]']");
	private By ProEmail = By.xpath("//input[@name='data[email]']");
	private By ProMobile = By.xpath("//input[@name='data[mobile]']");
	private By ProPic = By.xpath("//input[@type='file']");
	private By ProSave = By.xpath("//button[text()='Save']");
	private By ProEditCancel = By.xpath("//a[@id='edit-cancel']");
	private By ProClose = By.xpath("//i[@class='icofont icofont-close']");
	private By ChaPWD = By.xpath("//a[text()='Change Password']");
	private By NewPwd = By.xpath("//input[@name='newpassword']");
	private By ConfPwd = By.xpath("//input[@name='confirmpassword']");
	private By SavePwd = By.xpath("//button[text()='Change']");

	// Calender Table
	private By Calender = By.xpath("//table[@class='table dtp-picker-days']");
	// Calender Next button
	private By CalNextBtn = By.xpath("//a[@class='dtp-select-month-after']");
	// Calender Previous
	private By CalPrevBtn = By.xpath("//a[@class='dtp-select-month-before']");
	// Calender Month& Year Tab
	private By CalMonthYear = By.cssSelector(".dtp-picker-month");
	// Calender Date
	private By Date = By.xpath("//td[@data-date='29']");

	// Constructor
	public HostLoginPage(WebDriver driver) {
		this.driver = driver;
		// Implicit Wait (We didn't give Implicit and Explicit waits at a time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	// Page Actions
	public void HostValidData(DataTable dataTable) {
		List<List<String>> hostData = dataTable.cells();
		driver.findElement(Email).sendKeys(hostData.get(1).get(0));
		driver.findElement(password).sendKeys(hostData.get(1).get(1));
	}

	public void clickOnSignin() {
		driver.findElement(login).click();

		String Error = driver.findElement(login).getText();
		System.out.println(Error);
		if (Error.contains("Please check login")) {
			System.out.println("You have Entered Invalid data");
		} else {
			System.out.println("Login Successfull");
		}
	}

	public void clickForgot() {
		driver.findElement(ForogotPwd).click();
	}

	public void dismisForgot() {
		driver.findElement(ForogotDismis).click();
	}

	public void enterEmail() {
		driver.findElement(ForgotEmail).sendKeys("vantillu@yopmail.com");
	}

	public void clickOnSend() {
		driver.findElement(ForgotSend).click();
	}

	public void VerifySubmodules() throws InterruptedException {
		driver.findElement(DashB).click();
		System.out.println(driver.findElement(DashB).getText());
		driver.findElement(Catgories).click();
		System.out.println(driver.findElement(Catgories).getText());
		driver.findElement(Assets).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(Assets).getText());
		driver.findElement(Menu);
		Thread.sleep(1000);
		System.out.println(driver.findElement(Menu).getText());
		driver.findElement(Booking);
		System.out.println(driver.findElement(Booking).getText());

	}

	public void DashBData() {
		driver.findElement(DashB).click();
		System.out.println(driver.findElement(TotalUsers).getText());
// How to get the dynamic Count
		System.out.println(driver.findElement(TotalBook).getText());
		System.out.println(driver.findElement(TotalHost).getText());
		System.out.println(driver.findElement(TotalAsset).getText());
	}

	public void ClickOnCat() {
		driver.findElement(Catgories).click();
	}

	public void ClicKonAdd() {
		driver.findElement(AddB).click();
	}

	public void EnterCatData(DataTable dataTable) {
		List<List<String>> CataData = dataTable.cells();
		driver.findElement(CatName).sendKeys(CataData.get(1).get(0));
		driver.findElement(status).sendKeys(CataData.get(1).get(1));

	}

	public void ClickOnSave() {
		// WebDriverWait wait = new WebDriverWait(driver, 5);

//wait.until(ExpectedConditions.visibilityOfElementLocated(Save));
		driver.findElement(Save).click();
	}

	public void SearchValue(DataTable dataTable) {

		List<List<String>> searchCat = dataTable.cells();
		driver.findElement(search).sendKeys(searchCat.get(1).get(0));

	}

	public void Edit() {
		// Wait Object creation for Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
		// Explicit Wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(Edit));
		driver.findElement(Edit).click();

	}

	public void UpdateCatData(DataTable dataTable) {

		List<List<String>> updateCat = dataTable.cells();
		driver.findElement(CatName).sendKeys(updateCat.get(1).get(0));
		driver.findElement(status).sendKeys(updateCat.get(1).get(1));

	}

	public void changStatus(DataTable dataTable) {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		List<List<String>> SearchCat = dataTable.cells();
		driver.findElement(search).sendKeys(SearchCat.get(1).get(0));
		WebElement active = driver.findElement(StaActive);
		WebElement Inactive = driver.findElement(StaInactive);
		String status1 = active.getText();
		String status2 = Inactive.getText();
		System.out.println(status1);
		System.out.println(status2);
		if (status1 == "Active") {
			System.out.println("Status Active");
			wait.until(ExpectedConditions.visibilityOfElementLocated(StaInactive));
			driver.findElement(StaInactive).click();
		} else if (status1 == "Inactive") {
			System.out.println("Status Inactive");
			wait.until(ExpectedConditions.visibilityOfElementLocated(StaActive));
			driver.findElement(StaActive).click();
		}

	}

	public void Delete(DataTable dataTable) {
		driver.findElement(search).clear();
		List<List<String>> CatDelete = dataTable.cells();
		driver.findElement(search).sendKeys(CatDelete.get(1).get(0));

		driver.findElement(Delete).click();
	}

	public void cancelOnPopUp() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Cancel));
		driver.findElement(Cancel).click();
	}

	public void DeleteOnPopUp() {
		driver.findElement(YesDelete).click();

	}

	public void clickOnAsset() {
		driver.findElement(AssteMan).click();

	}

	public void AddAssetButton() {
		driver.findElement(AddAsset).click();
	}

	public void AddAssets(String CabinType, String Status) {
		/*
		 * //Explicit Waits WebDriverWait wait = new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CabinDrop));
		 * //need to give Single selection Dropdown Handling WebElement drop =
		 * driver.findElement(CabinDrop); Select CabinNameDrop = new Select(drop);
		 * List<WebElement> CabinOptions = CabinNameDrop.getOptions(); for (WebElement
		 * option : CabinOptions) { System.out.println(option.getText()); }
		 * 
		 * //CabinNameDrop.selectByIndex(1); //Or
		 * CabinNameDrop.selectByVisibleText("Team"); //Or
		 * //CabinNameDrop.selectByValue("1");
		 * 
		 * WebElement Statdrop =driver.findElement(AssetSta); Select StatusDrop = new
		 * Select(Statdrop); StatusDrop.selectByIndex(1);
		 * driver.findElement(Save).click();
		 */

// We can use above Method or Below one

		WebElement CabinN = driver.findElement(CabinDrop);
		CabinN.sendKeys(CabinType);
		CabinN.click();

		WebElement CabinSta = driver.findElement(AssetSta);
		CabinSta.sendKeys(Status);
		CabinSta.click();
		driver.findElement(Save).click();
	}

	public void SearchValue(String Search1) {

		WebElement SearchButton = driver.findElement(search);
		SearchButton.sendKeys(Search1);
	}

	public void SearchAsset(String Search2) {
		WebElement searchAsset = driver.findElement(search);
		searchAsset.sendKeys(Search2);

	}

	public void ClickDelete() {
		driver.findElement(Delete).click();
	}

	public void ClickYes() {
		driver.findElement(YesDelete).click();

	}

	public void switchStatus() {
		driver.findElement(StaInactive).click();
	}

	// Menu's Management
	public void clickMenuMa() {
		driver.findElement(MenuMa).click();

	}

	public void clickAddMenu() {
		driver.findElement(MenuAdd).click();
	}

	private By SwitchFrame = By.xpath("//iframe[@frameborder='0']");
	private By Descrip = By.xpath("//body[@contenteditable='true']");

	public void EnterTheBelow(DataTable dataTable) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		List<List<String>> EnterData = dataTable.cells();
		driver.findElement(CateDrop).sendKeys(EnterData.get(1).get(0));
		driver.findElement(MenuName).sendKeys(EnterData.get(1).get(1));
		driver.findElement(MenuCost).sendKeys(EnterData.get(1).get(2));

		// Iframe Handling
		driver.switchTo().frame(driver.findElement(SwitchFrame));
		WebElement Des = driver.findElement(MenuDes);
		System.out.println(MenuDes);
		Des.click();
		Des.clear();
		Des.sendKeys(EnterData.get(1).get(3));
		driver.switchTo().defaultContent();

		// ScrollBar Handling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		driver.findElement(AssetSta).sendKeys(EnterData.get(1).get(4));
		wait.until(ExpectedConditions.visibilityOfElementLocated(MenuSave));
		driver.findElement(MenuSave).click();

	}

	public void editMenu() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(EditMenu));
		driver.findElement(EditMenu).click();
	}

	public void UpdateMenu(DataTable dataTable) {
		WebDriverWait wait = new WebDriverWait(driver, 5);

		List<List<String>> UpdateData = dataTable.cells();
		driver.findElement(CateDrop).sendKeys(UpdateData.get(1).get(0));
		driver.findElement(MenuName).sendKeys(UpdateData.get(1).get(1));
		driver.findElement(MenuCost).clear();
		driver.findElement(MenuCost).sendKeys(UpdateData.get(1).get(2));
		// Iframe Handling
		driver.switchTo().frame(driver.findElement(SwitchFrame));
		WebElement Des = driver.findElement(MenuDes);
		System.out.println(MenuDes);
		Des.click();
		Des.clear();
		Des.sendKeys(UpdateData.get(1).get(3));
		driver.switchTo().defaultContent();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		driver.findElement(AssetSta).sendKeys(UpdateData.get(1).get(4));
		wait.until(ExpectedConditions.visibilityOfElementLocated(MenuSave));
		driver.findElement(MenuSave).click();
	}

	public void switchSta() {
		System.out.println(driver.findElement(MenuStaInactive).getText());
		driver.findElement(MenuStaInactive).click();
		System.out.println(driver.findElement(MenuStaInactive).getText());
	}

	// Booking Management

	public void clickBooking() {
		driver.findElement(clickBook).click();
	}

	public void searchBooking(String Compact) {
		WebElement bookingType = driver.findElement(BookSearch);
		bookingType.sendKeys(Compact);
	}

	public void viewBooking() {

		driver.findElement(ViewBook).click();

		WebElement Page = driver.findElement(viewBookPage);
		String BookPage = Page.getText();
		System.out.println(BookPage);

		WebElement Name = driver.findElement(userName);
		String uName = Name.getAttribute("value");
		System.out.println("User Name: " + uName);
		WebElement ID = driver.findElement(BookID);
		String BID = ID.getAttribute("Value");
		System.out.println("Booking Id: " + BID);

		WebElement HosName = driver.findElement(HostName);
		String Host = HosName.getAttribute("Value");
		System.out.println("Host Name: " + Host);

		WebElement Cab = driver.findElement(CabinName);
		String Cabin = Cab.getAttribute("Value");
		System.out.println("Cabin Name: " + Cabin);

		WebElement Loc = driver.findElement(Location);
		String Location = Loc.getText();
		System.out.println("Location: " + Location);

		WebElement Type = driver.findElement(BookingType);
		String BType = Type.getAttribute("Value");
		System.out.println("Booking Type: " + BType);

		WebElement time = driver.findElement(Frequency);
		String Fre = time.getAttribute("Value");
		System.out.println("Frequency: " + Fre);

		WebElement sDate = driver.findElement(startDate);
		String StartDat = sDate.getAttribute("Value");
		System.out.println("StartDate: " + StartDat);

		WebElement eDate = driver.findElement(EndDate);
		String EndDat = eDate.getAttribute("Value");
		System.out.println("EndDate: " + EndDat);

		WebElement meet = driver.findElement(MeetingAgenda);
		String MeetAim = meet.getText();
		System.out.println("Meeting Agenda: " + MeetAim);

		WebElement atten = driver.findElement(Attendees);
		String Attendees = atten.getAttribute("Value");
		System.out.println("No of Attendees: " + Attendees);

		WebElement Stat = driver.findElement(Bookstatus);
		String BStatus = Stat.getAttribute("Value");
		System.out.println("Booking Status: " + BStatus);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		driver.findElement(BackBtn).click();
	}

// Retriving the Table complete Data in that Page
	public void getBookingTableData() {

		WebElement table = driver.findElement(BookTable);

		List<WebElement> headerElements = table.findElements(TableRows);

		List<String> headers = new ArrayList<>();
		for (WebElement headerElement : headerElements) {
			String headerText = headerElement.getText();
			headers.add(headerText);
		}

		System.out.println("Column Headers: " + headers);

	}

	public void searchSpecific(String chai) {
		WebElement name = driver.findElement(search);
		name.sendKeys(chai);

	}

	public void getSpecificData() {

		WebElement Table = driver.findElement(BookTable);

		WebElement Rows = Table.findElement(specificData);

		List<WebElement> data = Rows.findElements(specificName);
		for (WebElement cell : data) {
			String getText = cell.getText();
			System.out.println("Get Specific Data: " + getText);
		}
	}

	// Profile Updation
	public void profilePage() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.findElement(Profile).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(profileIcon));
		driver.findElement(profileIcon).click();

		System.out.println(driver.findElement(proText).getText());

	}

	public void updateProfile(DataTable dataTable) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(proEdit));
		driver.findElement(proEdit).click();
		List<List<String>> profileData = dataTable.cells();
		driver.findElement(ProName).clear();
		driver.findElement(ProName).sendKeys(profileData.get(1).get(0));

//		WebElement datePicker = driver.findElement(DatePicker);
//		datePicker.sendKeys("06/01/2023");
//
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".dtp-select-day.selected")));
//		WebElement desiredDate = driver.findElement(By.cssSelector(".dtp-select-day.selected"));
//		desiredDate.click();
		driver.findElement(ProAddress).clear();
		driver.findElement(ProAddress).sendKeys(profileData.get(1).get(1));
		driver.findElement(ProEmail).clear();
		driver.findElement(ProEmail).sendKeys(profileData.get(1).get(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ProMobile));
		driver.findElement(ProMobile).clear();
		driver.findElement(ProMobile).sendKeys(profileData.get(1).get(3));
		driver.findElement(ProPic).sendKeys(profileData.get(1).get(4));

	}

	// Dynamic Calender Handling

	public void enterDate() {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		driver.findElement(DOB).click();
		WebElement date = driver.findElement(CalMonthYear);
		System.out.println(date.getText());
		date.click();

		// Click Calender field

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Calender));
		String MonthYearValue = driver.findElement(CalMonthYear).getText();
		System.out.println(MonthYearValue); // MAY 2023
		String Month = MonthYearValue.split(" ")[0].trim();
		String Year = MonthYearValue.split(" ")[1].trim();

		while (!(Month.equals("MAY") && Year.equals("2024"))) {
			driver.findElement(CalNextBtn).click();

			MonthYearValue = driver.findElement(CalMonthYear).getText();
			System.out.println(MonthYearValue); // MAY 2023
			Month = MonthYearValue.split(" ")[0].trim();
			Year = MonthYearValue.split(" ")[1].trim();
		}
		driver.findElement(Date).click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(CalOK));

		try {
			WebElement element = driver.findElement(CalOK);
		} catch (StaleElementReferenceException e) {
			WebElement element = driver.findElement(CalOK);
		}
		driver.findElement(CalOK).click();

		// driver.findElement(ProSave).click();
		driver.findElement(ProEditCancel).click();

		System.out.println(driver.findElement(proText).getText());

		// selectDate("5", "FEB", "2024");

	}

	/*
	 * public static String[] getMonthYear(String monthYearValue) { return
	 * monthYearValue.split(" "); }
	 * 
	 * 
	 * public void selectDate(String exDay, String exMonth, String exYear) {
	 * 
	 * if(exMonth.equals("FEB") && Integer.parseInt(exDay)>29) {
	 * System.out.println("Wrong Date: "+ exMonth+ " :"+exDay); return; }
	 * if(Integer.parseInt(exDay)>31) { System.out.println("Wrong Date: "+ exMonth+
	 * " :"+exDay); return; } String monthYearValue =
	 * driver.findElement(CalMonthYear).getText();
	 * System.out.println(monthYearValue);
	 * 
	 * while((getMonthYear(monthYearValue)[0].equals(exMonth) &&
	 * getMonthYear(monthYearValue)[1].equals(exYear))) {
	 * driver.findElement(CalNextBtn).click(); monthYearValue =
	 * driver.findElement(CalMonthYear).getText(); } try {
	 * driver.findElement(By.xpath("//td[@data-date=' " + exDay + " ']")).click(); }
	 * catch (Exception e) { System.out.println("Wrong Date: "+ exMonth+
	 * " :"+exDay); } }
	 */
	public void UpdatePWD(DataTable dataTable) {
		driver.findElement(ChaPWD).click();
		List<List<String>> updatePWD = dataTable.cells();
		driver.findElement(NewPwd).sendKeys(updatePWD.get(1).get(0));
		driver.findElement(ConfPwd).sendKeys(updatePWD.get(1).get(1));
		driver.findElement(SavePwd).click();
	}

	private By Logout = By.cssSelector(".icon-logout");

	public void Logout() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.findElement(Profile).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Logout));
		driver.findElement(Logout).click();
	}

	
			//Dynamic Calender
	public static String[] getMonthYear(String monthYearValue) {
		return monthYearValue.split(" ");
	}

	public void selectDate(String exDay, String exMonth, String exYear) {
	
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.findElement(DOB).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Calender));
		

//		if (exMonth.equals("FEB") && Integer.parseInt(exDay) > 29) {
//			System.out.println("Wrong Date: " + exMonth + " :" + exDay);
//			return;
//		}
//		if (Integer.parseInt(exDay) > 31) {
//			System.out.println("Wrong Date: " + exMonth + " :" + exDay);
//			return;
//		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(CalMonthYear));
		String monthYearValue = driver.findElement(CalMonthYear).getText();
	
		while (!(getMonthYear(monthYearValue)[0].equals(exMonth) && getMonthYear(monthYearValue)[1].equals(exYear))) {
			driver.findElement(CalNextBtn).click();	
			wait.until(ExpectedConditions.visibilityOfElementLocated(CalMonthYear));
			monthYearValue = driver.findElement(CalMonthYear).getText();
		}
		driver.findElement(By.xpath("//td[@data-date=' " + exDay + " ']")).click();
		
//		try {
//			driver.findElement(By.xpath("//td[@data-date=' " + exDay + " ']")).click();
//		} catch (Exception e) {
//			System.out.println("Wrong Date: " + exMonth + " :" + exDay);
//		}
	}
}
