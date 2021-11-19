package driverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	
	public static WebDriver setupDriver() {

	String exePath ="./driver/chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
	//WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(3));
	//webDriverWait.until(ExpectedConditions.alertIsPresent());
	return driver;
	}
}
