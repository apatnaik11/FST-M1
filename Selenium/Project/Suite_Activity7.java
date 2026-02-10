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

public class Suite_Activity7 {
	
	WebDriver driver;
	
	@Test (priority =0)
	public void initiate() {
		
		driver = new FirefoxDriver();
		
		driver.get("http://alchemy.hguy.co/crm");
		
		System.out.println("Title of the page is "+driver.getTitle());
		
		Assert.assertEquals("SuiteCRM", driver.getTitle());
		
	}
	
	@Test (dependsOnMethods = {"initiate"}, priority =1)
	public void header() {
		
		WebElement El = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
		String headerurl = El.getAttribute("src");
		System.out.println(headerurl);
		
		
	}
	
	@Test (priority = 2)
	public void copyright() {
		
		WebElement El2 =driver.findElement(By.xpath("//a[@id='admin_options']"));
		
		System.out.println("CopyRight Text is: "+El2.getText());
		
		
	}
	
	@Test (priority =3)
	public void login() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
		
		Thread.sleep(2000);
		
		WebElement El3 =driver.findElement(By.xpath("//span[text()='admin']"));
		
		Assert.assertTrue(El3.isDisplayed());
		
		
	}
	
	@Test (priority=4)
	public void getcolor() {
		
		WebElement El4 = driver.findElement(By.xpath("//div[@id='toolbar']"));
		
		Color Col = Color.fromString(El4.getCssValue("color"));
		
		System.out.println("Color of toolbar is: "+Col.asRgb());
		
	}
	
	@Test (priority =5)
	public void activity() {
		
		WebElement El5 = driver.findElement(By.xpath("//a[text()='Activities']"));
		
		Assert.assertTrue(El5.isDisplayed());
		
		
	}
	
	@Test(priority= 6)
	public void readpopup() {
		
		Actions actions = new Actions(driver);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement El6 = driver.findElement(By.xpath("//a[text()='Sales']"));
				
		actions.moveToElement(El6).perform();
		
		System.out.println("Hovered over E16");
		
		WebElement submenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Leads']")));
		
		submenu.click();
		
		
		//Table
		
		WebElement tablewait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='list view table-responsive']")));
		
		WebElement table = driver.findElement(By.xpath("//table[@class='list view table-responsive']"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		//
		
		WebElement additionalinfo = driver.findElement(By.xpath("//tbody/tr[1]/td[10]"));
		
		additionalinfo.click();
		
		
		WebElement forpopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Mobile:']")));
		
		String mobilenum =driver.findElement(By.xpath("//span[@class='phone']")).getText();
	
		System.out.println(mobilenum);
	
		
		
		/*
		int rowcount = rows.size();
		
		System.out.println(rowcount);
		
		String celldata;
		for(int i = 1; i < rowcount; i++) {
			
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			
			for(WebElement cell: cells) {
				
				celldata = cell.getText();
				
				if(celldata == "Ms. Nikita Jindal") {
				
					WebElement additionalinfo = driver.findElement(By.xpath("//tbody/tr[1]/td[10]"));
					
					additionalinfo.click();
					
					WebElement forpopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Mobile:']")));
					
					String mobilenum =driver.findElement(By.xpath("//span[@class='phone']")).getText();
				
					System.out.println(mobilenum);
				
					
				}
			}
			
		}
	
		*/
		
		
		
		
	}
}