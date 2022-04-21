import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectableDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/selectable");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("demo-tab-grid")).click();
		
		driver.findElement(By.xpath("//li[text()='One']")).click();
		driver.findElement(By.xpath("//li[text()='Two']")).click();
		driver.findElement(By.xpath("//li[text()='Three']")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
