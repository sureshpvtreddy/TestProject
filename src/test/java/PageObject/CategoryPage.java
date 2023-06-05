package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CategoryPage {

	private WebDriver driver;

	// Locators
	private By Category = By.xpath("//span[text()=' Category Management']");
	private By CatSearch = By.xpath("//input[@type='search']");
	private By CatStatus = By.xpath("//*[@id=\"hide1\"]/td[3]/span");
	private By CatEdit = By.xpath("//*[@id=\"hide2\"]/td[4]/div/div/button[1]/i");
	private By CatNameUp = By.xpath("//div[@class='col-sm-9']/input[@name='data[name]']");
	private By CatStatusDrop = By.xpath("//div[@class='col-sm-9']/select[@name='data[status]']");
	private By CatStaActive = By.xpath("//option[text()='Active']");
	private By CatStaInactive = By.xpath("//option[text()='Inactive']");
	private By CatSaveChanges = By.xpath("//button[text()='Save changes']");
	private By NextPage = By.xpath("//a[text()='Next']");
	private By PreviousPage = By.xpath("//a[text()='Previous']");
private By VerifyStatus = By.xpath("//*[@id=\"hide2\"]/td[3]/span");
	// Constructor

	public CategoryPage(WebDriver driver) {
		this.driver = driver;

	}

	// Page Actions
	public void clickOnCategory() {
		driver.findElement(Category).click();

	}

	public void clickOnSearch() {
		driver.findElement(CatSearch).click();

	}

	public void enterCatName(String name) {
		driver.findElement(CatSearch).sendKeys(name);
		System.out.println(name);
	}

	public void clickOnEdit() {
		WebElement edit = driver.findElement(CatEdit);
		edit.click();

	}

	public void updateCat(String name) {
		String newName = "Casual Dining";
		WebElement cName = driver.findElement(CatNameUp);
		cName.clear();
		cName.sendKeys(newName);
	}

	public void clickOnStatus() throws InterruptedException {
		driver.findElement(CatStatusDrop);
		// Single Selection Drop down handling
		WebElement dropdown = driver.findElement(CatStatusDrop);
		Select status = new Select(dropdown);
		// aa Dropdown lo vunna List of Elements Console print cheyadani ki List method
		// use chestam
		List<WebElement> statusOptions = status.getOptions();
		for (WebElement option : statusOptions) {
			System.out.println(option.getText());
		}
		status.selectByIndex(0);
		Thread.sleep(1000);
		status.selectByVisibleText("Inactive");
		driver.findElement(CatStaInactive);
		Thread.sleep(1000);
		// last select chesina Text print cheyadaniki
		String selectedText = status.getFirstSelectedOption().getText();
		System.out.println("selected Visible Text " + selectedText);
	}

	public void clickOnSaveChanges() {
		WebElement save = driver.findElement(CatSaveChanges);
		save.click();

	}

	public void searchLatest() {
		WebElement SearchUpdated = driver.findElement(CatSearch);
		SearchUpdated.sendKeys("NewName");
	}
	public void verify() {
		WebElement verify = driver.findElement(VerifyStatus);
		String A = verify.getText();
		System.out.println(A);
		
	}
	public void changeStatus() {
		WebElement verify = driver.findElement(VerifyStatus);
		verify.click();
		//System.out.println(A);
	}
}
