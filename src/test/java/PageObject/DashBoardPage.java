package PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;

public class DashBoardPage {

	private WebDriver driver;

	// 1. Locators
	private By email = By.xpath("//*[@id=\"insert_login_form\"]/div[3]/div/input");
	private By pwd = By.xpath("//*[@id=\"insert_login_form\"]/div[4]/div/input");
	private By login = By.xpath("//*[@id=\"insert_login_form\"]/div[5]/div[1]/button");
	private By verify = By.xpath("//*[@id=\"login_error_msg\"]");
	private By forgotPwdLink = By.xpath("//*[@id=\"insert_login_form\"]/div[5]/div[2]/p/a");
	private By LoginAlert = By.id("login_error_tab");
	private By loginVerify = By.cssSelector("button[name='submit']");
	private By DashVerify = By.xpath("//h4[text()='Dashboard']");
private By loginSuccess = By.xpath("//p[text()='Login successful']");
// 2. Constructor
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// 3. Page Actions
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public void enterUserName(String username) {
		driver.findElement(email).sendKeys(username);
	}

	public void enterPassword(String Password) {
		driver.findElement(pwd).sendKeys(Password);
	}

	public void clickOnLogin() {
		driver.findElement(login).click();
	}

	public void verifyAlertMessage(String Alert) {
		driver.findElement(verify).equals(Alert);
	}
	public void verifyLogMessage() {
		String successMessage = driver.findElement(loginSuccess).getText();
		System.out.println(successMessage);
		if (successMessage.contains("Login successful")) {
			System.out.println("USer is on Login page");
		} else
		  	{
			System.out.println("Please check login Details");
			
			
		}
		
	}

	public String getDashBoardPageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();

	}

	public void verifyData(String Aemail) {
		WebElement emailField = driver.findElement(email);
		emailField.sendKeys(Aemail);

	}

	public void enterpassword(String password) {
		WebElement passwordField = driver.findElement(pwd);
		passwordField.sendKeys(password);

	}

	public void enterFollowingData(String Email, String Password) {

		driver.findElement(email).sendKeys(Email);
		driver.findElement(pwd).sendKeys(Password);

	}

	private By LWarning = By.xpath("//label[text()='This field is required.']");
	private By LWarning1 = By.xpath("//label[text()='Please enter a valid email address.']");
	private By LWarning2 = By.xpath("//div[@class='alert alert-danger']");
	public void vefrifyPage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement Warning = driver.findElement(LWarning);
		String Edatawarning = Warning.getText();
				
		WebElement Warning1 = driver.findElement(LWarning1);
		String VFwarning = Warning1.getText();
				
		WebElement Warning2 = driver.findElement(LWarning2);		
		String WrongData = Warning2.getText();
			System.out.println(WrongData);	
		WebElement Sucess = driver.findElement(loginSuccess);
		String sucess = Sucess.getText();
		
		if(Edatawarning.equals("This field is required.")) {
			System.out.println("Error: " + Edatawarning);
		}
		else if(VFwarning.equals("Please enter a valid email address.")) {
			System.out.println("Error: " + VFwarning);
		}
		else if(WrongData.equals("Please check login credentials")) {
			System.out.println("Error: " + WrongData);
		}
		else 
			{
			System.out.println("user is on Dashboard Page" + sucess);
			}

}
}