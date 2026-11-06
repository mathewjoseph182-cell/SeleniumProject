package TestNGpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iframehandling {
	
	WebDriver driver;

    @BeforeTest
    public void setUp()
    {
        driver=new ChromeDriver();
        driver.get("https://keralaproperty.in/member/login/");
        driver.manage().window().maximize();
    }
    
    @Test(priority = 1)
    public void loginmthd()
    {
    	WebElement user= driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
    	user.sendKeys("ar@gmai.com");
    	
    	WebElement pass= driver.findElement(By.xpath("//*[@id=\"upass\"]"));
    	pass.sendKeys("74185");
    	
    	WebElement submit =driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
    	submit.click();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.urlContains("myhome"));
    	
    }
    
    @Test(priority = 2)
    public void addproperty()
    {
    	WebElement addprop =driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
    	addprop.click();
    	
    	//summary box comes under iframe so we need to pass values to the summary box
    	WebElement FrameTag = driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
    	driver.switchTo().frame(FrameTag);
    	
    	WebElement summarybox =driver.findElement(By.xpath("/html/body"));
    	summarybox.click();
    	summarybox.sendKeys("abcd");
    	
    	driver.switchTo().defaultContent();
    }

}
