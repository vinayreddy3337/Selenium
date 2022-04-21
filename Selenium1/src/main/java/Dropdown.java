import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//to launch browser
		driver.get("https://demoqa.com/select-menu");
		
		//maximize browser
		driver.manage().window().maximize();
		
		
		//to locate Dropdown
		Select s = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		//s.selectByValue("3");
		//s.selectByIndex(4);
		s.selectByVisibleText("white");
	}

}
