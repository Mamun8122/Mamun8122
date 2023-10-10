package windowHindle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTestingPropertiseFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		//WebDriverManager.chromedriver().setup();
		driver = null;
		
		String BrowserName = "Chrome";
		
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		
		else if (BrowserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		else if (BrowserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		else {
			System.out.println("Provide a valid browser nsme");
		}
		
		driver.get("https://www.amazon.in");
	}
}