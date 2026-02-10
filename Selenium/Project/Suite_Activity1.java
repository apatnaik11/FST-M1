package SuiteCRM_Project1;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Suite_Activity1 {
	
	WebDriver driver;
	
	@Test (priority =0)
	public void initiate() {
		
		driver = new FirefoxDriver();
		
		driver.get("http://alchemy.hguy.co/crm");
		
		System.out.println("Title of the page is "+driver.getTitle());
		
		Assert.assertEquals("SuiteCRM", driver.getTitle());
		
	}
	
}
