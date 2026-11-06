package TestNGpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeTest
	public void beforetestmthd()
	{
		System.out.println("BeforeTest method ");
	}
	
	@BeforeClass
	public void beforeclassmthd() 
	{
		System.out.println("BeforeClass method ");
	}
	
	@BeforeMethod
	public void method()
	{
		System.out.println("BeforeMethod method ");
	}
	
	@Test
	public void testmthd_A()
	{
		System.out.println("TestMthd_A");
	}
	
	@Test
	public void testmthd_X()
	{
		System.out.println("TestMthd_X");
	}
	
	@Test
	public void testmthd_C()
	{
		System.out.println("TestMthd_C");
	}
	
	@AfterMethod
	public void af_mthd()
	{
		System.out.println("AfterMethod mthd");
	}
	
	@AfterClass
	public void af_class()
	{
		System.out.println("AfterClass mthd");
	}
	
	@AfterTest
	public void af_test()
	{
		System.out.println("AfterTest mthd");
	}
	
}
