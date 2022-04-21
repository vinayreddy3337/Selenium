import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.id("firstName"));
		w1.sendKeys("WhiteBox");
		
		WebElement w2=driver.findElement(By.id("lastName"));
		w2.sendKeys("QA");
		
		WebElement w3=driver.findElement(By.id("userEmail"));
		w3.sendKeys("Whiteboxqa@gmail.com");
		
		WebElement w4=driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"]"));
		w4.click();
		
		WebElement w5=driver.findElement(By.id("userNumber"));
		w5.sendKeys("1234567");
		
		WebElement w=driver.findElement(By.id("subjectsInput"));
		w.click();
		w.sendKeys("Physics");
	Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Sports']")).click();
		driver.findElement(By.xpath("//label[text()='Reading']")).click();
		driver.findElement(By.xpath("//label[text()='Music']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("uploadPicture")).click();
		
		driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]")).sendKeys("Hyderabad");
	}
	
	

}
