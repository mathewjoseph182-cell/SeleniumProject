package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_pgm {
	ChromeDriver driver;
	@BeforeEach
	public void browser_setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
		public void home() throws Exception
		{
			Thread.sleep(2000);//java wait used to wait for particular time period here it is 2 sec(2000 milisec)
			WebElement Search=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
			//Search.sendKeys("Mobiles");
			Search.sendKeys("Mobiles",Keys.ENTER);//to press the enter key( Keys.Enter) 
			
			Thread.sleep(2000);
	        WebElement electronics = driver.findElement(By.xpath("//div[@id=\"nav-xshop\"]/ul/li[6]/div/a"));
	        electronics.click();

	        WebElement cart = driver.findElement(By.xpath("//div[@id=\"nav-cart-text-container\"]"));
	        cart.click();
		
		}

}
