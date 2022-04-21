import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgressBar {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		

driver.get("https://demoqa.com/progress-bar");

driver.manage().window().maximize();

 driver.findElement(By.id("startStopButton")).click();

Thread.sleep(15000);

driver.findElement(By.id("resetButton")).click();

	}

}
