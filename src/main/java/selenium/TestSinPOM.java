package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSinPOM {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String exePath ="./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.applitools.com//");  //inicializa el chrome en URL especificada
		driver.manage().window().maximize(); //maximizar ventana
		
		//Identificar objetos/WebElements de la pagina web
		
		WebElement userName = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.id("log-in"));
		
		//login
		userName.sendKeys("homar");
		Thread.sleep(2000);
		password.sendKeys("112");
		Thread.sleep(2000);
		btnLogin.click();
		Thread.sleep(2000);
		driver.quit();

}
	
}
