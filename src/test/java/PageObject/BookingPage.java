package PageObject;

import static org.junit.Assert.assertArrayEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingPage {
	
	private WebDriver driver;
	
	//1. Locators
	private By BookingsManag = By.xpath("//span[text()='Bookings Management']");
	private By search = By.xpath("//input[@type='search']");
	private By view = By.xpath("//i[@class='fa fa-eye']");
	
	private By Back = By.xpath("//button[text()='Back']");
	private By VerifyViewPage = By.xpath("//h4[text()='View Bookings']");
	private By VerifyBookingPage = By.xpath("//h4[text()='Bookings Management']");
	
	// Constructor
	 public BookingPage(WebDriver driver) {
		 this.driver = driver;
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 }

	 
	 
	 // Page Actions
	 
	 public void clickOnBookingMng() {
		 driver.findElement(BookingsManag).click();
	 }
	 public void verifyBookingPage() {
		System.out.println(driver.findElement(VerifyBookingPage).getText());
		//assert.assertArrayEquals("Bookings Management", " ");
	 }
	  public void clickOnsearch() {
		 WebElement searchBooking = driver.findElement(search);
		 searchBooking.click();
	  }
	  public void enterName(String UserName) {
		  driver.findElement(search).sendKeys(UserName);
	  }
	 public void clickOnView() {
		 driver.findElement(view).click();
	 }
	 public void verifyViewPage() {
		 System.out.println(driver.findElement(VerifyViewPage).getText());
	 }
	 public void scrollDown() {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
	 }
	 public void clickOnBack() {
		 driver.findElement(Back).click();
	 }
}
