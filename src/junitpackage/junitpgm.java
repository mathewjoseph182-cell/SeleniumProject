package junitpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitpgm 
{
	  ChromeDriver driver;
	@BeforeEach 
	public void browsersetup()
	{
		 System.out.println("befeore each");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
	}
      @Test
      public void titleverification()
      {
    	  String actualtitle = driver.getTitle();
    	  String expectedtitle="Google";
    	  if(expectedtitle.equals(actualtitle))
    	  {
    	    System.out.println("Same Title");
    	  }
    	  else {
    		  System.out.println("mismatch Title");
    	  }
      }
       @Test
       public void method2()
       {
    	   System.out.println("Method 2");
    	   
       }
        @AfterEach
        public void closingmethod()
        {
        	 System.out.println("after each method");
           driver.close();//to close the browser tab
           driver.quit();
        }
}
