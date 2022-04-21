import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Instantiating the JS Executors 
				JavascriptExecutor js= (JavascriptExecutor)driver;
				
				//handling the synchronous scripts
				//js.executeScript("alert('This is a Facebook page')");
				
				//handling Asynchronous scripts
				js.executeAsyncScript("window.setTimeout(function(){alert('second');},5000);");

	}

}
