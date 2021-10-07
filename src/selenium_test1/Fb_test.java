package selenium_test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\selenium_test\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
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
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("7");
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(6);
	    WebElement year = driver.findElement(By.id("year"));
	    Select s2=new Select(year);
	    s2.selectByVisibleText("2000");
	    WebElement gender = driver.findElement(By.xpath("//label[@class='_58mt']"));
		gender.click();
		WebElement signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
		signup.click();
	}

}
