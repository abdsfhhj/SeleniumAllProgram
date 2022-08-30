package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class signUp {
 WebDriver driver;
	
	String fbUrl = "https://www.fb.com";
	String facebookUrl = "https://www.facebook.com";
	//String facebookUrl = "https://www.facebook.com";
	@BeforeMethod
	public void beforeMethod(){
		System.setProperty("webdriver.chrome.driver",
				"./good/Chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.get(fbUrl);
		
		String urlFromBrowser = driver.getCurrentUrl();
		
		
		if(urlFromBrowser.equalsIgnoreCase(facebookUrl)) {
			System.out.println("fb has redirected to facebook");
		} else {
			System.out.println("No redirection happened");
		}
		
	}
	
	
	@Test
	public void facebookSignUp() {
		
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("User");
		driver.findElement(By.name("reg_email__")).sendKeys("testuser@test.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("testPassword");
		
		Select selDate = new Select(driver.findElement(By.id("day")));
		Select selMonth = new Select(driver.findElement(By.id("month")));
		Select selYear = new Select(driver.findElement(By.id("year")));
		
		selDate.selectByVisibleText("21");
		selMonth.selectByVisibleText("Jun");
		selYear.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		
		//driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}
	
	
	@AfterMethod
	public void closeBrowser(){
		
		//driver.quit();
		
	}

}

