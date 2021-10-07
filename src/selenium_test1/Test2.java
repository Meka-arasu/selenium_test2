package selenium_test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\selenium_test\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println("Title :"+title);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("url :"+currentUrl);
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);

		driver.quit();
		
		
		

	}
}
