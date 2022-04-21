import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		WebElement w1= driver.findElement(By.xpath("//iframe[@id=\"frame2\"]"));
		
		driver.switchTo().frame(w1);
		System.out.println(driver.getPageSource());
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
	}

}
