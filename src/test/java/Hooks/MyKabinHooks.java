package Hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import DriverFactory.MyKabinDriverFactory;
import Utils.MyKabinConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyKabinHooks {
	private MyKabinDriverFactory myKabinDriverFactory;
	private WebDriver driver;
	// ConfigReader.java file ni ikkada call chestamu
	private MyKabinConfigReader myKabinConfigReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() {
		myKabinConfigReader = new MyKabinConfigReader();
		prop = myKabinConfigReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		myKabinDriverFactory = new MyKabinDriverFactory();
		driver = myKabinDriverFactory.init_driver(browserName);
		
	}

	@After(order = 0)
	public void quitBrowser() {
	driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take a screen shot
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image", screenshotName);
		}
	}
}


