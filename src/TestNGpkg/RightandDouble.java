package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RightandDouble {

	ChromeDriver driver;
		
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void login() throws Exception
	{
		WebElement doublebtn = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		Actions act =new Actions(driver);
		act.doubleClick(doublebtn);
		
		Thread.sleep(2000);
		
		WebElement rightbtn = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		act.contextClick(rightbtn);
		
		act.perform();
	}
	
}
