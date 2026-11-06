package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Copypaste {

	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void copypaste()
	{
		WebElement fullname = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input"));
		fullname.sendKeys("abcd");
	
	// to select the value from fullname field(ctrl+a)
		
		Actions act = new Actions(driver);
		act.keyDown(fullname, Keys.CONTROL).sendKeys("a");
		act.keyUp(Keys.CONTROL);
		
		act.keyDown(fullname, Keys.CONTROL).sendKeys("c");
		act.keyUp(Keys.CONTROL);
		
		WebElement mail =driver.findElement(By.xpath("//input[contains(@id,'login')]"));
		
		act.keyDown(mail, Keys.CONTROL).sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
	}
	
	@AfterClass
	public void closingmthd()
	{
		driver.quit();
	}
	
}
