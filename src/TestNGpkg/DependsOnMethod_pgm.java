package TestNGpkg;

import org.testng.annotations.Test;

public class DependsOnMethod_pgm {

	@Test
	public void Reg()
	{
		System.out.println("Registration method");
	}
	
	@Test(dependsOnMethods = "Reg") //login method is depends on the reg() method so it will work only after reg method
	public void login()
	{
		System.out.println("login method");
	}
	
	@Test(dependsOnMethods = {"Reg","login"})
	public void home()
	{
		System.out.println("Home method");
	}
}
