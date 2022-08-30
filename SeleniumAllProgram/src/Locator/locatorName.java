package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./good/chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("vasant@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("@1Vasant23$");

		driver.findElement(By.name("login")).click();
		
		

	}

}
