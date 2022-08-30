package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.className("_8esh")).click();



	}

}
