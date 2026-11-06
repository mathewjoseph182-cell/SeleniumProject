package junitpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralaproperty {
ChromeDriver driver;
@BeforeEach
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://keralaproperty.in/member/login/");
	driver.manage().window().maximize();
}
	@Test
	public void titileverification()
	{
		String actualtitle=driver.getTitle();
		System.out.println("Title of the web page: "+actualtitle);
		
	}
	
	@Test
	public void textverification()
	{
		String sourcecode=driver.getPageSource(); //to retrieve the source code information
		if(sourcecode.contains("User Login"))
		{
			System.out.println("Text is present.");
		}
		else
		{
			System.out.println("Text is not present.");
		}
	}
	@Test
	public void login()
	{
		WebElement username=driver.findElement(By.id("ulogin")); //locating username with locator id
		username.sendKeys("abcd");  //only accepts string values
		
		WebElement password=driver.findElement(By.name("upass")); //locating password field with locator name
		password.sendKeys("pass123");
		
		WebElement loginbutton=driver.findElement(By.id("sub_logbtn"));
		loginbutton.click();
		System.out.println("Login successfull");
	}
@AfterEach
	public void closewindow()
	{
	driver.quit();	
	}

}
