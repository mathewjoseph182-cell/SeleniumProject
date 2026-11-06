package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains {
	ChromeDriver driver;
	
	@BeforeEach
	public void browser_setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	
	}
	
	@Test
	public void method1() throws InterruptedException
	{
		WebElement rediffmail= driver.findElement(By.xpath("//input[contains(@id,'login')]"));
		rediffmail.sendKeys("hello@gmail.com");
	
		Thread.sleep(2000);
		WebElement Fullname = driver.findElement(By.xpath("//input[contains(@name,'name')and @placeholder=\"Enter your full name\"]"));
		Fullname.sendKeys("mathew");
		
	
	}

}
