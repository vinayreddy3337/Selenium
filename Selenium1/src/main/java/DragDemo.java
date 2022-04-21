import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
WebDriver driver= new ChromeDriver();
driver.get("https://demoqa.com/dragabble");
driver.manage().window().maximize();

WebElement from=driver.findElement(By.id("dragBox"));

Actions act=new Actions(driver);
act.dragAndDropBy(from, 100, 200).build().perform();

Thread.sleep(3000);
driver.close();

	}

}
