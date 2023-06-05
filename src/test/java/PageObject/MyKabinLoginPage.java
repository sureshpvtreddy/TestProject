package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyKabinLoginPage {
	private WebDriver driver;

	// 1. By Locators
	private By emailId = By.xpath("//div[@class='form-group']//div/input[@name='email']");
	private By password = By.xpath("//div[@class='form-group']//div/input[@name='password']");
	private By signInButton = By.xpath("//div[@class='col-sm-6']/button[@type='submit']");
	private By verifyAlert = By.xpath("//div/span[text()='Please check login credentials']");
	private By pageTitle = By.linkText("Login");
	private By forgotPwdLink = By.xpath("Login");
	private By userMannagement = By.xpath("//ul[@class='sidebar-menu']/li[@class='active']/a/i");
private By Title = By.xpath("//div[@class='main-header']/h4");
private By Addbtn = By.xpath("//div[@class='col-sm-6 text-right']/a/button");
private By AddName = By.xpath("//div[@class='col-sm-8']/input[@name='data[full_name]']");
private By Addemail = By.xpath("//div[@class='col-sm-8']/input[@name='data[email]']");
private By AddMobile = By.xpath("//div[@class='col-sm-8']/input[@name='data[mobile]']");
private By AddPassword = By.xpath("//div[@class='col-sm-8']/input[@name='password']");
private By AddAddress = By.xpath("//div[@class='col-sm-8']/textarea[@class='form-control']");
private By status = By.xpath("//div[@class='col-sm-8']/select[@name='data[status]']");
private By ActiveStatus = By.xpath("//div[@class='col-sm-8']/select[@name='data[status]']/option[@value='1']");
private By SaveChanges = By.xpath("//div[@class='text-right col-sm-11 p-4']/button[@type='submit']");
	
// 2. constructor of the Page Class;
	public MyKabinLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page Actions: features(behaviour) of the page the form of methods;
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}

	public void verifyingDashboardPageOpenedOrNot() throws InterruptedException {
		boolean verify = driver.findElement(verifyAlert).isDisplayed();
		Thread.sleep(1000);
		//Assert.assertTrue(verifyAlert);
		
	}
	
	public void clickOnUserManagement() {
		driver.findElement(userMannagement).click();
		
		
	}

	public void getPageTitle() {
		driver.findElement(Title).click();
		
	}
}