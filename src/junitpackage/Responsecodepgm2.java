package junitpackage;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodepgm2 {
ChromeDriver driver;
	
	@BeforeEach
	public void browser_setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	@Test
	public void linkcout() throws Exception
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links="+links.size());
		
		for(WebElement li:links)
		{
			String url=li.getAttribute("href");
			verify(url);
		}
	}
	private void verify(String url) throws Exception {
		
		try {
			
		URI obj = new URI(url);
		URL Value = obj.toURL();
		HttpURLConnection con = (HttpURLConnection)Value.openConnection();
		int responsecode = con.getResponseCode();
		
		if(responsecode==200)
		{
			System.out.println("Valid Link"+url);
		}
		else if(responsecode==404)
		{
			System.out.println("Broken link"+url);
		}
		else
		{
			System.out.println("Other Response code"+url);
		}
		
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
