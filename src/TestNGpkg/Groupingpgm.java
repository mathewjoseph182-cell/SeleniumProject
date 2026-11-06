package TestNGpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Groupingpgm {

	@BeforeClass(alwaysRun=true)
	public void Bfclass_mthd()
	{
		System.out.println("Bfclass mthd");
	}
	
	@Test(priority = 1,groups = "Smoke")
	public void Ts_mthd1()
	{
		System.out.println("Ts_mthd1");
	}
	
	@Test(priority = 2,groups = "Sanity")
	public void Ts_mthd2()
	{
		System.out.println("Ts_mthd2");
	}
	
	@Test(priority = 3,groups = {"Regrssion","Smoke"})
	public void Ts_mthd3()
	{
		System.out.println("Ts_mthd3");
	}
	
	@AfterClass(alwaysRun=true)
	public void AfClass_mthd()
	{
		System.out.println("AfClass_mthd");
	}
}
