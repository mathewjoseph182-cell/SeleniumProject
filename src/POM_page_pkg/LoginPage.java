package POM_page_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{	
	WebDriver driver;

	//locating webelements using page factory
	@FindBy(xpath = "//*[@id=\"ulogin\"]")WebElement Username;
	@FindBy(id="upass")WebElement Password;
	@FindBy(xpath = "//*[@id=\"sub_logbtn\"]")WebElement Loginbtn;
	
	//Constructor
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void setvalues()
	{
		Username.sendKeys("abc@gmail.com");
		Password.sendKeys("1234");
	}
	
	public void loginmthd()
	{
		Loginbtn.click();
	}
	
	public String titlemthd()
	{
		String title = driver.getTitle();
		return title;
	}
	
	
}
