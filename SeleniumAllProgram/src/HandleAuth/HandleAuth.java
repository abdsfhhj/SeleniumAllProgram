package HandleAuth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//good//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		String authtext = driver.findElement(By.xpath("//*[@id=\"content\"]")).getText();
		System.out.println(authtext);


	}

}
