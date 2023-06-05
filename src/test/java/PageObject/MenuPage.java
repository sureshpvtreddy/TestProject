package PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MenuPage {

	private WebDriver driver;

	// 1 Locators
	private By Management = By.xpath("//*[@id=\"sidebar-scroll\"]/ul/li[4]/a/span");
	private By search = By.xpath("//input[@type='search']");
	private By Status = By.xpath("//span[@data-id='37']");
	private By edit = By.xpath("//*[@id=\"hide34\"]/td[7]/div/div/button/i");
	private By CatgoryDrop = By.xpath("//select[@id='category']");
	private By Categorys = By.xpath("//option[text()='food v']");
	private By Menu = By.xpath("//input[@name='data[name]']");
	private By Amount = By.xpath("//input[@name='data[cost]']");
	private By description = By.xpath("//body[@contenteditable='true']");
	private By Statusdrop = By.xpath("//select[@name='data[status]']");
	private By statusActive = By.xpath("//option[text()='Active']");
	private By statusInActive = By.xpath("//option[text()='Inactive']");
	private By saveChanges = By.xpath("//button[@type='button']");
	private By SwitchToIframe = By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']");

// constructor [After giving this constructor only we must go to the
	// StepDeinition file else stepDefinition file throws an error//
	public MenuPage(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	// Page Actions

	public void clickOnMenuManage() {
		driver.findElement(Management).click();
	}

	public void clickOnSearch() {
		driver.findElement(search).click();
	}

	public void enterName(String name) {
		driver.findElement(search).sendKeys(name);
	}

	public void clickOnEdit() {
		driver.findElement(edit).click();
	}

	public void selectCategory(String CategoryName) {
		WebElement mCat = driver.findElement(CatgoryDrop);
		mCat.click();
		mCat.sendKeys(CategoryName);

	}

	public void menu(String MenuName) {

		WebElement mName = driver.findElement(Menu);
		mName.clear();
		mName.sendKeys(MenuName);

	}

	public void cost(String cost) {
		WebElement mCost = driver.findElement(Amount);
		mCost.clear();
		mCost.sendKeys(cost);

	}

	public void description(String Description) {
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
//		String Des = driver.findElement(By.xpath("//body[@contenteditable='true']")).getText();
//		System.out.println(Des);

		// Or

		driver.switchTo().frame(driver.findElement(SwitchToIframe));
		WebElement Des = driver.findElement(description);
		System.out.println(Des);

		Des.click();
		Des.clear();
		Des.sendKeys(Description);
		// here by using this method we can exit from the iframe
		driver.switchTo().defaultContent();

	}

	// Window Scroll Bar Handling
	/* inspect the web page go to Console Type this window.scrollBy(0,300) */

	public void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		// ** Inside Tables in A Window Scroll Bar Handling **//
		/*
		 * inspect the web page go to Console Type this document.querySelector and then
		 * go to the Elements find the element to that table and then give .scrollTop=
		 * 300
		 */
		// Example: if the table element path is .tableFixHead
		// * Then we will code like this
		// document.querySelector(".tableFixHead")..scrollTop= 300 **/

	}

	public void updateStatus() {
		// Single Selection Dropdown Handling

		WebElement drop = driver.findElement(Statusdrop);
		Select Status = new Select(drop);

		List<WebElement> statusOption = Status.getOptions();
		for (WebElement option : statusOption) {
			System.out.println(option.getText());

		}
		
		Status.selectByIndex(0);
		driver.findElement(statusInActive);

		// Or use this method

//		Status.selectByVisibleText("Active");
//		driver.findElement(statusActive);
		String selectedText = Status.getFirstSelectedOption().getText();
		System.out.println("selected Visible Text " + selectedText);
	}

	public void save() {
		driver.findElement(saveChanges).click();
	}

	
	//Pending if Else Condition
	public void clickOnSataus() {
		String name = "Biriyani";
		WebElement mName = driver.findElement(Status);
		mName.sendKeys(name);

		if (driver.findElement(Status).equals("Active")) {
			System.out.println("Menu Status is Active");
			driver.findElement(Status).click();
			System.out.println(driver.findElement(Status).getText());

		} else if (driver.findElement(Status).equals("InActive")) {
			System.out.println("Menu Status is InActive");
		} else {
			System.out.println("Input text does not match any condition");
		}
	}
}