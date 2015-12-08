package dataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testone {
	
	
	@Test
	public void LounchBrowser() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000L);
		driver.close();
		driver.quit();
		
	}
	

}
