package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragandDrop {

	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void drag_drop() throws Exception
	{
		WebElement src = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
		
		Thread.sleep(2000);
		
		WebElement hoverbtn = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
		act.moveToElement(hoverbtn).perform();
		
		WebElement link = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
		link.click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		WebElement clickandhold = driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
		act.clickAndHold(clickandhold).perform();
		
		Thread.sleep(2000);
		
		WebElement doublebtn = driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
		act.doubleClick(doublebtn).perform();
		
		Thread.sleep(2000);
	}
}
