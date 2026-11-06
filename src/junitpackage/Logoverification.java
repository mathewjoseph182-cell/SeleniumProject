package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logoverification {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browser_setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void login() throws Exception
	{
		WebElement logo = driver.findElement(By.xpath("//img[@title=\"Rediffmail\"]"));
		boolean result=logo.isDisplayed();
		
		if(result==true)
		{
			System.out.println("logo is visible");
		}
		else
		{
			System.out.println("logo is not visible");
		}
		
		WebElement fbtn = driver.findElement(By.xpath("//div/label/input[contains(@name,'gender')and @value=\"f\"]"));
		boolean buttonenb = fbtn.isEnabled();
		fbtn.click();
		System.out.println("female btn is enabled "+buttonenb);
		
		
		WebElement checkbox = driver.findElement(By.xpath("//div/input[@type=\"checkbox\"]"));
		checkbox.click();
		boolean checkboxbtn= checkbox.isSelected();
		if(checkboxbtn==true)
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
			
			Thread.sleep(2000);
		}
		
	}
	
}
