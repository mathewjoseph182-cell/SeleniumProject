package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/mathe/OneDrive/Desktop/Alert.html");
		driver.manage().window().maximize();
		
	}
	@Test
	public void display() throws Exception
	{
		WebElement displaybtn=driver.findElement(By.xpath("/html/body/input[1]"));
		displaybtn.click();
		
		Alert alrt=driver.switchTo().alert();
		String text= alrt.getText();
		System.out.println("alert text "+text);
		
		Thread.sleep(2000);
		alrt.accept();
		
		WebElement fname= driver.findElement(By.xpath("/html/body/input[2]"));
		fname.sendKeys("abcd");
		
		WebElement sname= driver.findElement(By.xpath("/html/body/input[3]"));
		sname.sendKeys("efgh");
	
		WebElement submitbtn= driver.findElement(By.xpath("/html/body/input[4]"));
		submitbtn.click();
		
	}
}
