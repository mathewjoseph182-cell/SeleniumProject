package TestNGpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hardassertionpgm {

	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
	 	driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}	
		@Test(priority = 1)
		public void titleverification()
		{
			String actualtitle=driver.getTitle();
//			System.out.println("actualtitle");
			
			String expectedtitle="Rediffmail Free Unlimited Storage"; // this line will be executed only after the assertion
			Assert.assertEquals(expectedtitle, actualtitle);
			System.out.println("Success");
			
		}
		
		@Test(priority = 2)
		public void urlverification() 
		{
			String actualurl = driver.getCurrentUrl();
//			System.out.println("actualurl");
		
			String expectedurl="https://register.rediff.com/register/register.php?FormName=user_details";
			Assert.assertEquals(expectedurl, actualurl);
			System.out.println("Success");
		
		}
	
	
}
