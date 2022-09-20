package TestScrips;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartTest {
	@Test
	public void AddToCartTest1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			
			
			driver.findElement(By.name("q")).sendKeys("winter heater");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//a[text()='DARSHANAM WORLD 220v 500w Portable Electric Heater Mini...']")).click();
			Set<String> window = driver.getWindowHandles();
			Iterator<String> win = window.iterator();
			while(win.hasNext())
			{
				String winhan = win.next();
				String Currenttitle = driver.switchTo().window(winhan).getTitle();
			
			if(Currenttitle.contains("DARSHANAM WORLD")) {
				break;
			}
			}
			String product = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			 String expproduct = driver.findElement(By.xpath("//a[@class='_2Kn22P gBNbID']")).getText();
			 Assert.assertEquals(product, expproduct);
			 System.out.println("product is added to the cart");
			 driver.close();
	}
	}



