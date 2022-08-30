package practies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class good {
	
	static WebDriver driver;
	
	public static void LunchBrowser(String BrowserName, String url)
	{
		if(BrowserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Good/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver","./Good/geckodriver.exe");
		}
		driver.get(url);
	}

	public static void main(String[] args) {
	
		good.LunchBrowser("Chrome", "https://www.facebook.com/");
		good.LunchBrowser("firefox", "https://www.google.com/");
	}

}
