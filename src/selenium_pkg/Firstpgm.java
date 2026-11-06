package selenium_pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstpgm {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
