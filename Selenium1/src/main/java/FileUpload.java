import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
       WebDriver driver= new ChromeDriver();
       
       driver.get("https://demoqa.com/upload-download");
       driver.manage().window().maximize();
     //for Uploading 
       WebElement w1=driver.findElement(By.id("uploadFile"));
       w1.sendKeys("C:\\Users\\vinay\\Desktop\\Selenium WebDriver with Java Cheat Sheet.pdf");
       Thread.sleep(3000L);
       
      //For Downloading
      WebElement w2= driver.findElement(By.id("downloadButton"));
      w2.click();
	}

}
