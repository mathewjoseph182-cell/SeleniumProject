package POM_test_pkg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_base_pkg.BaseClass;
import POM_page_pkg.LoginPage;

public class LoginTest extends BaseClass  // here we extends to retrieve the driver information from Base class
{
	LoginPage obj;
		
	@BeforeMethod
	public void objectmethod()
	{
		obj = new LoginPage(driver);
	}
	
	@Test
	public void logintestmthd()
	{
		obj.setvalues();
		obj.loginmthd();
	}
	
	@Test
	public void titleverification()
	{
		System.out.println(obj.titlemthd());
	}
}
