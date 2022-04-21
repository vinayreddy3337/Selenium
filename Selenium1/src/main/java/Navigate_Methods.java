import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_Methods {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("http://www.whiteboxqa.com/schedule.php");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
