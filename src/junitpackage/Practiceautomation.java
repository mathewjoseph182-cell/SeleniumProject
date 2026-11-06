package junitpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceautomation {

    ChromeDriver driver;

    @BeforeEach
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize(); // to maximize the window 
    }

    @Test
    public void titleverification()
    {
        String actualtitle=driver.getTitle();
        System.out.println("Title of the webpage: "+actualtitle);
    }

    @Test
    public void login()
    {
        WebElement username = driver.findElement(By.id("username"));// id is the locator
        username.sendKeys("student"); // only string values are accepted
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Password123");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
    }

    @AfterEach
    public void closewindow()
    {
        driver.quit();
    }

}
