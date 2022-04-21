import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		
		WebElement w1= driver.findElement(By.xpath("//label[text()='Yes']"));
		//WebElement w1= driver.findElement(By.xpath("//label[text()='Impressive']"));
		//WebElement w1= driver.findElement(By.xpath("//label[text()='No']"));
		w1.click();

	}

}
