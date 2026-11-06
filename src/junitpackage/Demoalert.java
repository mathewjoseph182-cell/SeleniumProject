package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoalert {
	
ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
	}
	@Test
	public void demosite() throws Exception
	{
		WebElement alertwthok=driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		alertwthok.click();
		
		Alert alrt=driver.switchTo().alert();
		String text= alrt.getText();
		System.out.println("alert text "+text);
		
		Thread.sleep(2000);
		alrt.accept();
		
		WebElement alertwthokcancel=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alertwthokcancel.click();
		
		Thread.sleep(5000);
		
		WebElement alertbtn2=driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		alertbtn2.click();
		
		Alert alrt1=driver.switchTo().alert();
		String text2= alrt1.getText();
		System.out.println("alert text "+text2);
		
		Thread.sleep(3000);
		alrt1.dismiss();
		
		WebElement alertwthtext=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		alertwthtext.click();
		
		WebElement alertbtn3=driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		alertbtn3.click();
		
		Alert alrt2=driver.switchTo().alert();
		String text3= alrt2.getText();
		System.out.println("alert text "+text3);
		alrt2.sendKeys("mathew");
		
		Thread.sleep(2000);
		alrt2.accept();
		
		
	}
}
