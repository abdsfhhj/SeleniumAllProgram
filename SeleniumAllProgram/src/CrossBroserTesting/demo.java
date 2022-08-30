package CrossBroserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	
	
	static WebDriver driver;
	  public static void LunchBrowser(String BrowserName, String url)
	  {
		  if(BrowserName.equals("Chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver", "./Good/chromedriver.exe");
			  driver = new ChromeDriver();
		  }
		  else if(BrowserName.equals("firefox"))
		  {
			  System.setProperty("webdriver.firefox.driver", "./Good/geckodriver.exe");
			  driver = new FirefoxDriver();
		  }
		  driver.get(url);
	  }
	  
	  
	  
	public static void main(String[] args) {
		demo.LunchBrowser("Chrome", "https://www.facebook.com/");
		demo.LunchBrowser("firefox", "http://www.gmail.com/");

	}

}
