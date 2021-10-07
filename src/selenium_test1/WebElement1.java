package selenium_test1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\selenium_test\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println("Title :" + title);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement creation = driver.findElement(By.xpath("(//a[@ role='button'])[2]"));
		creation.click();
		Thread.sleep(2000);
	
	    WebElement firstname =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("meka");
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		lastname.sendKeys("c");
		
		WebElement email= driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		email.sendKeys("aaaaaass@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("ghgs362577");
		
	    WebElement gender = driver.findElement(By.xpath("//label[@class='_58mt']"));
		gender.click();
		
		WebElement signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
		signup.click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\lenovo\\eclipse-workspace\\selenium_test\\screenshot\\shot.png");
	    org.apache.commons.io.FileUtils.copyFile(source, destination);
	}
}
