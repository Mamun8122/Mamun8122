package windowHindle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHindle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung s22");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		String firstWindow= driver.getWindowHandle();
		
		Set <String> s= driver.getWindowHandles();
		ArrayList ar= new ArrayList(s);
		driver.switchTo().window((String) ar.get(1));
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		driver.switchTo().window((String) ar.get(0));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		System.out.println(ar.get(0));
		//or
		System.out.println(firstWindow);
		System.out.println(ar.get(1));
		//Thread.sleep(4000);
		//driver.close();


	}

}
