package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	ChromeDriver driver;
	
	@BeforeClass
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Parameters({"user","pass"})
	
	@Test
	public void login(String user, String pass)
	{
		WebElement username= driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		username.sendKeys(user);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		password.sendKeys(pass);
	}
}
