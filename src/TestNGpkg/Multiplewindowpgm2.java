package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindowpgm2 {
	
	WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
    }

    @Test
    public void testwindow() throws Exception {
        
        String parentwindow = driver.getWindowHandle();
        System.out.println("Title " + driver.getTitle());

        WebElement clickbtn = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
        clickbtn.click();
        System.out.println("Title" + driver.getTitle());
        Thread.sleep(4000);

        driver.switchTo().window(parentwindow);
        Thread.sleep(5000); // to close the advertisement

        WebElement windowbtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
        windowbtn.click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
        System.out.println("Title" + driver.getTitle());
        Thread.sleep(5000);

        driver.switchTo().window(parentwindow);

        WebElement multiplebtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
        multiplebtn.click();
        driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button")).click();
        System.out.println("Title" + driver.getTitle());
        Thread.sleep(5000);
    }

    @AfterTest
    public void ends() {
        driver.quit();
    }
}