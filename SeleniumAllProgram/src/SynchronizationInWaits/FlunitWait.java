package SynchronizationInWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlunitWait {
	
		@Test
		    public void FluntWait() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".//good//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com/");
			driver.manage().window().maximize();
			driver.findElement(By.name("q")).sendKeys("selenium");
			Thread.sleep(5000);
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);


			}

}
