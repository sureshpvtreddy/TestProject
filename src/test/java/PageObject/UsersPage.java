package PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import io.cucumber.core.cli.Main;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsersPage {

	private WebDriver driver;

	// 1 Locators
	private By Aemail = By.xpath("//*[@id=\"insert_login_form\"]/div[3]/div/input");
	private By Apwd = By.xpath("//*[@id=\"insert_login_form\"]/div[4]/div/input");
	private By login = By.xpath("//*[@id=\"insert_login_form\"]/div[5]/div[1]/button");

	private By UserMangement = By.xpath("//a[@class='waves-effect waves-dark']/span[text()=' Users Management']");
	private By AddButton = By
			.xpath("//div[@class='col-sm-6 text-right']/a/button[@class='btn btn-primary fa fa-plus text-right']");
	private By userName = By.xpath("//input[@name='data[full_name]']");
	private By chooseFile = By.xpath("//input[@name='image']");
	private By userEmail = By.xpath("//input[@name='data[email]']");
	private By Usermobile = By.xpath("//input[@name='data[mobile]']");
	private By UserPwd = By.xpath("//input[@name='password']");
	private By UserAddress = By.xpath("//textarea[@name='data[address]']");
	private By SelectStatus = By.xpath("//select[@name='data[status]']");
	private By StatusActive = By.xpath("//select[@name='data[status]']/option[text()='Active']");
	private By StatusIn_Active = By.xpath("//select[@name='data[status]']/option[text()='In-Active']");
	private By SaveChanges = By.xpath("//button[@id='submit']");
	private By TitleSucess = By.xpath("//div[@data-notify='container']/span[text()=' Success']");
	private By NotificationMessage = By.xpath("//div[@data-notify='container']/span[@data-notify='message']/p");
	private By Edit = By.xpath("//*[@id=\"user_212\"]/td[8]/div/div/a/button/i");

	private By Delete = By.xpath("//*[@id=\"user_179\"]/td[8]/div/div/button/i");
	private By DeletePopup = By.xpath("//div/button[text()='Yes, delete it!']");
	private By CancelPopup = By.xpath("//button[text()='Cancel']");
	private By Search = By.xpath("//input[@type='search']");
	private By statusButton = By.xpath("//span[@data-id='179']");
	private By copyData = By.xpath("//span[text()='Copy']");
	private By csvData = By.xpath("//span[text()='CSV']");
	private By ExcelData = By.xpath("//span[text()='Excel']");
	private By PdfData = By.xpath("//span[text()='PDF']");
	private By printData = By.xpath("//span[text()='Print']");

	// 2 constructor

	public UsersPage(WebDriver driver) {
		this.driver = driver;

		// Initialize WebDriverWait with the desired timeout

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	// 3 Page Actions

	public void enterAdminName(String username) {
		driver.findElement(Aemail).sendKeys(username);
		System.out.println(username);
	}

	public void enterAdminPassword(String Password) {
		driver.findElement(Apwd).sendKeys(Password);
	}

	public void clickOnLogin() {
		driver.findElement(login).click();
	}

	public void clickOnUsersManagement() {
		driver.findElement(UserMangement).click();
	}

	public void clickOnAdd() {
		driver.findElement(AddButton).click();
	}

	public void enterUserName(String name) {
		driver.findElement(userName).sendKeys(name);

	}

	public void clickOnChooseFile(String imagePath) {
		WebElement fileUploadInput = driver.findElement(chooseFile);

		// Provide the absolute path to the image file
		String absolutePath = "C:\\Users\\Openteq\\Desktop\\pexels-photo.jpeg";
		// String UpdatedPath = "D:\\Suresh Testing\\Images\\PNG (4).jfif";

		// Set the file path in the file upload input element
		fileUploadInput.sendKeys(absolutePath);
		// fileUploadInput.sendKeys(UpdatedPath);
	}

	public void enterEmail(String email) {
		driver.findElement(userEmail).sendKeys(email);
	}

	public void enterMobile(String mobile) {
		driver.findElement(Usermobile).sendKeys(mobile);
	}

	public void enterPassword(String pwd) {
		driver.findElement(UserPwd).sendKeys(pwd);
	}

	public void enterAddress(String Address) {
		driver.findElement(UserAddress).sendKeys(Address);
	}

	public void ClickOnSaveChanges() {
		driver.findElement(SaveChanges).click();
	}

	public void SucessMessage() {
		String title = driver.findElement(TitleSucess).getText();
		String message = driver.findElement(NotificationMessage).getText();
		System.out.println(driver.findElement(NotificationMessage));
//	System.out.println("title");
//	System.out.println("message");
//	Assert.assertTrue(title.contains(" Success"));
//	Assert.assertTrue(message.contains("Data Updated Successfully"));

	}

	public void Edit() {
		driver.findElement(Edit).click();
	}

	public void Clear() {
		// Alert alert = driver.switchTo().alert();
		WebElement name = driver.findElement(userName);
		name.clear();

		WebElement choosefile = driver.findElement(chooseFile);
		choosefile.clear();

		WebElement email = driver.findElement(userEmail);
		email.clear();

		WebElement mobile = driver.findElement(Usermobile);
		mobile.clear();

		WebElement Address = driver.findElement(UserAddress);
		Address.clear();

	}

	public void updateUserDetails() throws InterruptedException {
		WebElement name = driver.findElement(userName);
		name.sendKeys("Thanu");
		Thread.sleep(2000);
//		WebElement choosefile = driver.findElement(chooseFile);
//		choosefile.sendKeys("D:\\Suresh Testing\\Images\\PNG (4).jfif");
//		Thread.sleep(2000);

		WebElement fileUploadInput = driver.findElement(chooseFile);
		String UpdatedPath = "D:\\Suresh Testing\\Images\\PNG (4).jfif";
		fileUploadInput.sendKeys(UpdatedPath);
		Thread.sleep(2000);

		WebElement email = driver.findElement(userEmail);
		email.sendKeys("thanis@yopmail.com");
		Thread.sleep(2000);
		WebElement mobile = driver.findElement(Usermobile);
		mobile.sendKeys("9145987512");
		Thread.sleep(2000);

		WebElement Address = driver.findElement(UserAddress);
		Address.sendKeys("PeddammaTemple,Jublee Hills");
		Thread.sleep(2000);

		WebElement dropdownElement = driver.findElement(SelectStatus);
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByIndex(0);
	}

	public void Delete() {
		driver.findElement(Delete).click();
	}

	public void DeleteYes() {
		driver.findElement(DeletePopup).click();

	}

	public void ClickOnCancel() {
		driver.findElement(CancelPopup).click();
	}
	public void clickOnSearch() {
		WebElement searchbutton = driver.findElement(Search);
		searchbutton.sendKeys("chanvi@yopmail.com");
	}
	public void clickOnStatus() {
		driver.findElement(statusButton).click();
	}
	
	public void reports() {
		WebElement copy = driver.findElement(copyData);
		copy.click();
		WebElement csv =driver.findElement(csvData);
		csv.click();
		WebElement excel = driver.findElement(ExcelData);
		excel.click();
		WebElement pdf = driver.findElement(PdfData);
		pdf.click();
		WebElement print = driver.findElement(printData);
		print.click();
	}
}
