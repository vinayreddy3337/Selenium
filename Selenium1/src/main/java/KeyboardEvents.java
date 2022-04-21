import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();

driver.get("https://www.facebook.com");

driver.manage().window().maximize();

WebElement w1= driver.findElement(By.id("email"));
w1.click();
w1.sendKeys("whiteboxqa@gmail.com");


WebElement w2= driver.findElement(By.id("pass"));
w2.click();
w2.sendKeys("123456789");
	}

}
