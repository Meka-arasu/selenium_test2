	package selenium_test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\selenium_test\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement alert_ok = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		alert_ok.click();
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simple.click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    WebElement alert_ok_cancel = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		alert_ok_cancel.click();
		WebElement confirm = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirm.click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().dismiss();
	    WebElement alert_text = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		alert_text.click();
		WebElement prompt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        prompt.click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().sendKeys("teddy");
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);
	    driver.quit();	

	}

}
