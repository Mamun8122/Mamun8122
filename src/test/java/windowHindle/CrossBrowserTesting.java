package windowHindle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop= new Properties(); 
		File file= new File("config.properties");
		
		FileInputStream fis =new FileInputStream (file);
		
		prop.load(fis);
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = null;
		
		String BrowserName = prop.getProperty("browser");
		
		if (BrowserName.equalsIgnoreCase("chrome")) {
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