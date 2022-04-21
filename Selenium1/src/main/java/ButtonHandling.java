import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();

		WebElement w1=driver.findElement(By.id("doubleClickBtn"));
		WebElement w2=driver.findElement(By.id("rightClickBtn"));

		Actions act=new Actions(driver);
		act.doubleClick(w1).perform();
		act.contextClick(w2).perform();


		Thread.sleep(3000);
		driver.close();

	}
}
