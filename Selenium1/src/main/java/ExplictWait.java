import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictWait {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
		@SuppressWarnings("deprecation")
		WebDriverWait w= new WebDriverWait(driver,50L);
		WebElement w1=w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create New Account")));
		w1.click();
	}

}
