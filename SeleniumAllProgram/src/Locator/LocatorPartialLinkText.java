package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPartialLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./good/chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");		

//		driver.findElement(By.partialLinkText("English")).click();
//		driver.findElement(By.partialLinkText("Forgotten")).click();

		driver.findElement(By.partialLinkText("UK")).click();
		driver.findElement(By.partialLinkText("pass")).click();



	}

}
