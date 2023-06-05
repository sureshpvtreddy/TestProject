package DriverFactory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.safari.SafariDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class MyKabinDriverFactory {

			public WebDriver driver;
			public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
			public WebDriver init_driver(String browser) {
				System.out.println("browser value is:" + browser);
				
					
					if (browser.equals("chrome")) {
						WebDriverManager.chromedriver().setup();
						//.set method to set the Driver
						tlDriver.set(new ChromeDriver());
					} else if (browser.equals("firefox")) {
						WebDriverManager.firefoxdriver().setup();
						tlDriver.set(new FirefoxDriver());
					} else if (browser.equals("safari")) {
						tlDriver.set(new SafariDriver());
					} else {
						System.out.println("Please pass the correct browser value: " + browser);
					}

					getDriver().manage().deleteAllCookies();
					getDriver().manage().window().maximize();
					return getDriver();
					
					
				}
			
			public static synchronized WebDriver getDriver() {
				// TODO Auto-generated method stub
				return tlDriver.get();
				
				
			}

	}
