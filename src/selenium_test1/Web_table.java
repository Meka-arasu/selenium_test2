package selenium_test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\selenium_test\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		List<WebElement> list1 = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		int s = list1.size();
		System.out.println("Size :" + s);
		for (int i = 0; i < s; i++) {
			String text = list1.get(i).getText();
			System.out.println(text);
			if (i == 7) {

				break;

			}

		}
	}

}
