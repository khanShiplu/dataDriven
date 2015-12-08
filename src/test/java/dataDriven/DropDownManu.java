package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DropDownManu {
	@Test
	public void manu() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://wikipedia.org");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("Eesti");
		Thread.sleep(3000L);
		driver.close();
		driver.quit();
	}

}
