package selenium_test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_handling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\selenium_test\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement nested = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		nested.click();
		WebElement outer_frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer_frame);
		WebElement inner_frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner_frame);
		WebElement  text= driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("welcome");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		WebElement singleframe = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		singleframe.click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
