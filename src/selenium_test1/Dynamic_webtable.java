package selenium_test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\selenium_test\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		List<WebElement> all_header1 = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr"));
		for (int i = 0; i < all_header1.size(); i++) {
			List<WebElement> all_rowheader = all_header1.get(i).findElements(By.tagName("th"));
			for (int j = 0; j < all_rowheader.size(); j++) {
				
			 
				String s =  all_rowheader.get(j).getText();
				s = s.replaceAll("\n", " ");
				//System.out.println(s);
			
				if (s.contains("Country")) {
					int country_index = j;
					System.out.println("country index:" + country_index);
				}else if(s.equalsIgnoreCase("new cases"))
				{
					int new_cases_index=j;
					System.out.println("new cases:"+new_cases_index);
				}
			}

		}

	}
}

