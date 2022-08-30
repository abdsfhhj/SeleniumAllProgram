package Command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Good//chromedriver.exe");

		//System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh(); //navigation command


		//String pTitile = driver.getTitle();
		//System.out.println(pTitile);
		//Thread.sleep(1000);
		//String crrU = driver.getCurrentUrl();
		//System.out.println(crrU);
		//Thread.sleep(1000);
		//String PageS = driver.getPageSource();
		//System.out.println(PageS);
	}
	}


