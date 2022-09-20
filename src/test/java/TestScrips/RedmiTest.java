package TestScrips;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedmiTest {
	@Test
	public void RedmiTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("redmi mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	  driver.findElement(By.xpath("//li[contains(text(),'4 GB RAM | 64 GB ROM | Expandable Upto 512 GB')]/../../../div[1]"));
	  System.out.println("redmi 4gb caputred");
	  driver.close();
		
	

}
}



