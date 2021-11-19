package loginTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;

public class TC_01 {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.URL_PAGE);
		driver.manage().window().maximize();
		
	}
	
	
  @Test
  public void TC_01_CorrectLogin() {
	  login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
  }
  
  @Test
  public void TC_02_IncorrectCorrectLogin() {
	  login.login("ads","");
  }
  
  
  @AfterTest
  public void CloseDriver() {
	  driver.close();
  }
  
}
