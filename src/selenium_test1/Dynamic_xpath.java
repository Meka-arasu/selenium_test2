package selenium_test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\selenium_test\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.myntra.com/myntra-fashion-store?f=Brand%3ABiba%3A%3AGender%3Amen%20women%2Cwomen&rf=Discount%20Range%3A30.0_100.0_30.0%20TO%20100.0");
		driver.manage().window().maximize();
		List<WebElement> allprices = driver
				.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < allprices.size(); i++) {
			String text = allprices.get(i).getText().substring(4);
			int parseInt = Integer.parseInt(text);
			a.add(parseInt);

		}
		System.out.println(a);
		System.out.println("current size:" + a.size());
		System.out.println("minimum price:" + Collections.min(a));
	}
}
