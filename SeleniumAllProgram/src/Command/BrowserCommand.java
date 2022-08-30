package Command;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//Good//chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		String pTitle =driver.getTitle();
		System.out.println(pTitle);
		Thread.sleep(1000);
		String crrUrl = driver.getCurrentUrl();
		System.out.println(crrUrl);
		Thread.sleep(1000);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		Thread.sleep(1000);
		driver.close();
	}

}
