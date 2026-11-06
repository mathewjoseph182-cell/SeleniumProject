package TestNGpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Datepickerpgm 
{

	ChromeDriver driver;

	@BeforeClass
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
	}

	@Test
	public void datepicker() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement calender = driver.findElement(By.xpath("//*[@id='datepicker1']"));
		calender.click();

		while (true) // Find Month
		{

			String month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText(); // locate
			System.out.println("month=" + month);

			if (month.equalsIgnoreCase("January 2027")) 
			{
				break;
			}

			else 
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click(); // click on the next
			}

		}
		//driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[3]/a")).click();
		
		List<WebElement> date = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		
		for (WebElement d : date)
		{
			String datetext =d.getText();
			if(datetext.equals("25"))
			{
				d.click();
				System.out.println("Date Selected");
				break;
			}
		}
	}
}
