package Command;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseandQuitCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Good//chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		
		String ptitle=driver.getTitle();
		System.out.println(ptitle );
		
		driver.close();
		
		String CuurUrl =driver.getCurrentUrl();
		System.out.println(CuurUrl);
		//driver.quit();
		
	}


	}


