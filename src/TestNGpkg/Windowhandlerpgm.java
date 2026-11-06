package TestNGpkg;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandlerpgm {
	
	WebDriver driver;

    @BeforeTest
    public void setUp()
    {
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws Exception
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String parentwindow = driver.getWindowHandle(); // details of parent window (single window)

        WebElement searchbar=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        searchbar.sendKeys("Mobiles");

        WebElement icon=driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
        icon.click();

        WebElement phnlink=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a"));
        phnlink.click();

        Set<String> tabdetails = driver.getWindowHandles();

        for (String handle : tabdetails)
        {
            if (!handle.equalsIgnoreCase(parentwindow))
            {
                driver.switchTo().window(handle);
                // Thread.sleep(5000);
                File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileHandler.copy(s, new File("C:\\Users\\mathe\\OneDrive\\Desktop\\Selenium Works\\Screenshot\\amazon.png"));
                System.out.println("Screenshot Saved");
            }
        }
    }

}
