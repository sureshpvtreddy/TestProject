package PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import io.cucumber.datatable.DataTable;

public class AssetPage {
	
	private static final TimeUnit TimeUnit = null;

	private WebDriver driver;

	//1 Locators 
	private By Email = By.xpath("//div[@class='md-input-wrapper']/input[@name='email']");
	private By Password = By.cssSelector("input[type='password']");
	private By login = By.cssSelector("button[name='submit']");
	private By AssetMg = By.xpath("//span[text()='Assets Management']");
	private By search = By.cssSelector("input[type='search']");
	private By status = By.cssSelector("span[data-status='1']");
	private By Delete = By.cssSelector("i[aria-hidden='true']");
	
	private By LoginError = By.id("//span[@id='login_error_msg']");
	private By LoginSuccess = By.xpath("//span/p[text()='Login successful']");
	
	
	
	
	
	
	//2 Constructor
	
	public AssetPage(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	// 3 Page Actions
	
	public void enterDetails(DataTable dataTable) {
		List<List<String>> adList = dataTable.cells();
		driver.findElement(Email).sendKeys(adList.get(1).get(0));
		driver.findElement(Password).sendKeys(adList.get(1).get(1));
		
		
	}
	 public void pressLog() {
		 driver.findElement(login).click();
	 }
	 
	 public void loginValidation() {
		 WebElement loginError = driver.findElement(LoginError);
		 String errMsg = driver.findElement(LoginError).getText().trim();
		 WebElement loginSuccess = driver.findElement(LoginSuccess);
		 String succesccMsg = driver.findElement(LoginSuccess).getText().trim();
		if(loginError.getText().equals(errMsg)){
			driver.findElement(LoginError).isDisplayed();
			System.out.println("Entered Invalid Login Credentials");
		 }else if(loginSuccess.getText().equals(succesccMsg)){
			 driver.findElement(LoginSuccess).isDisplayed();
            System.out.println(" Login Successfull using valid credtendials!!");
        }
		//Better to use seperate methods for Verifying Invalid login and Login Success
	 }
	
	public void searchAsset(String GodavariRestaurent ) {
		driver.findElement(search).sendKeys(GodavariRestaurent);
	}
	
	public void upAsset() {
		
		// Single Selection Dropdown Handling
	
			driver.findElement(status);
			WebElement update = driver.findElement(status);
			Select 	Status = new Select(update);
		List<WebElement> statusOption = Status.getOptions();
		for (WebElement option: statusOption) {
			System.out.println(option.getText());
		}
		Status.selectByIndex(0);
		driver.findElement(status);
	}
	
	public void clickDelete() {
		driver.findElement(Delete);
	}
}
