import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys("whiteboxqa@gmail.com");
	}

}
