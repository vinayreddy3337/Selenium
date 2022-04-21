import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Prompt1 {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
	 driver.findElement(By.id("promtButton")).click();
	
      Alert alert= driver.switchTo().alert();
      alert.sendKeys("hello world");
      Thread.sleep(3000); 
      alert.accept();
	
		
	}

}
