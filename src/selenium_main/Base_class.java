package selenium_main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base_class {
	static WebDriver driver;

	public static void browser_launch(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\selenium_test\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);

	}

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();

	}
	public static void navigate_to(String url1) {
	driver.navigate().to(url1);

	}
	public static void navigate_back() {
		driver.navigate().back();

	}
	public static void navigate_forward() {
		driver.navigate().forward();

	}
	public static void navigate_refresh() {
		driver.navigate().refresh();

	}
	public static void click_element(WebElement clk) {
		clk.click();		

	}
	public static void mouse_fn()
	{
		Actions a=new Actions(driver);
		
		
		

	}
	
	
	
	
	

}
