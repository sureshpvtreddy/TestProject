package PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;

public class HostBizPage {

	private WebDriver driver;

	// 1 Locators
	private By AdminEmail = By.xpath("//div[@class='md-input-wrapper']/input[@name='email']");
	private By AdminPwd = By.xpath("//div[@class='md-input-wrapper']/input[@name='password']");
	private By login = By.xpath("//button[@value='submit']");
	private By hostBizMan = By.xpath("//*[@id=\"sidebar-scroll\"]/ul/li[7]/a/i");
	private By addBtn = By.xpath("//button[@class='btn btn-primary fa fa-plus text-right waves-effect waves-dark']");
	private By HostName = By.xpath("//input[@name='data[full_name]']");
	private By userName = By.xpath("//input[@name='data[user_name]']");
	private By choosefile = By.xpath("//input[@name='user_image']");
	private By email = By.xpath("//input[@name='data[email]']");
	private By mobile = By.xpath("//input[@name='data[mobile]']");
	private By pwd = By.xpath("//input[@name='password']");
	private By hotelAddress = By.xpath("//input[@name='data[address]']");
	// private By dynamic = By.xpath("//label[@class='text-danger']");
	private By city = By.xpath("//input[@id='locality']");
	private By status = By.xpath("//select[@name='data[status]']");
	private By save = By.xpath("//button[@id='submit']");
	private By deleteHost = By.xpath("//button[@class='btn waves-effect waves-light delete_user']");
	// HostBiz Locators
	private By Hostemail = By.xpath("//div[@class='md-input-wrapper']/input[@name='email']");
	private By HostPwd = By.xpath("//div[@class='md-input-wrapper']/input[@name='password']");
	private By HostLogin = By.xpath("//div[@class='col-sm-6']/button[@name='submit']");
	private By LoginSuccessMsg = By.xpath("//p[text()='Login successful']");
	private By HostProfileIcon = By.xpath("//span/img[@alt='User Image']");
	private By HostLogout = By.xpath("//a/i[@class='icon-logout']");
	private By VerifyLogInPage = By.xpath("//h3[@class='text-center txt-login']");

	// Constructor
	public HostBizPage(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// page Actions
	public void enterAdminDetails(DataTable dataTable) {

		List<List<String>> adminList = dataTable.cells();
		driver.findElement(AdminEmail).sendKeys(adminList.get(1).get(0));
		driver.findElement(AdminPwd).sendKeys(adminList.get(1).get(1));
	}

	public void clickOnLoginBtn() {
		driver.findElement(login).click();
	}

	public void clickOnHostMan() {
		driver.findElement(hostBizMan).click();
	}

	public void clickOnAdd() {
		driver.findElement(addBtn).click();
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300)");
	}

	public void enterHostBizDetails(DataTable dataTable) {
		List<List<String>> hostBizz = dataTable.cells();
		driver.findElement(HostName).sendKeys(hostBizz.get(1).get(0));
		driver.findElement(userName).sendKeys(hostBizz.get(1).get(1));
		driver.findElement(choosefile).sendKeys(hostBizz.get(1).get(2));
		driver.findElement(email).sendKeys(hostBizz.get(1).get(3));
		driver.findElement(mobile).sendKeys(hostBizz.get(1).get(4));
		driver.findElement(pwd).sendKeys(hostBizz.get(1).get(5));

		/*
		 * Dynamic Drop downs Or Auto Sugestive Drop down Handling
		 * 
		 * WebElement ele = driver.findElement(hotelAddress); ele.clear();
		 * ele.sendKeys(hostBizz.get(1).get(6)); ele.sendKeys(Keys.ARROW_DOWN);
		 * ele.sendKeys(Keys.ENTER);
		 */

		/*
		 * The below method is very useful when we have static/Dynamic Drop downs
		 * 
		 * List<WebElement> dynamicList = driver.findElements(hotelAddress);
		 * driver.findElement(hotelAddress).sendKeys(hostBizz.get(1).get(6)); for (int
		 * i=0; i<dynamicList.size(); i++) { String text = dynamicList.get(i).getText();
		 * System.out.println("Text is"+ text);
		 * if(text.contains("hostBizz.get(1).get(6)")) { dynamicList.get(i).click();
		 * break;
		 * 
		 * }
		 * 
		 * }
		 */

		driver.findElement(hotelAddress).sendKeys(hostBizz.get(1).get(6));
		driver.findElement(city).sendKeys(hostBizz.get(1).get(7));
		driver.findElement(status).sendKeys(hostBizz.get(1).get(8));

	}

	public void clickSave() {
		driver.findElement(save).click();
	}

	public void HostLoginCredentials(String HostEmail, String Password) {
		driver.findElement(Hostemail).sendKeys(HostEmail);
		driver.findElement(HostPwd).sendKeys(Password);

	}

	public void HostLog() {
		driver.findElement(HostLogin).click();
	}

	public void VerifySuccess() {
		WebElement successMsg = driver.findElement(LoginSuccessMsg);
		String verify = successMsg.getText();
		System.out.println(verify);
		if (verify == "Login successful") {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Login not Successfull");
		}
	}

	public void hLogout() {
		driver.findElement(HostProfileIcon).click();
		driver.findElement(HostLogout).click();

	}

	public void verifyLogoutSucess() {
		WebElement sucessLogin = driver.findElement(VerifyLogInPage);
		String logoutVerify = sucessLogin.getText();
		if (logoutVerify == "Sign In to your account") {
			System.out.println("You are in Login Page");
		} else {
			System.out.println("you are not in login page");
		}
	}
}
