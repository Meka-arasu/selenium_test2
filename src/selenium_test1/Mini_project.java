package selenium_test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\selenium_test\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		women.click();
		WebElement dress = driver.findElement(By.xpath("//img[@class='replace-2x img-responsive']"));
		dress.click();
		WebElement cart = driver.findElement(By.xpath("//button[@name='Submit']"));
		cart.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed.click();
		WebElement proceed2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed2.click();
		Thread.sleep(2000);
		WebElement email = driver
				.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input"));
		email.sendKeys("meka1988@gmail.com");
		Thread.sleep(2000);
		WebElement create = driver
				.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button"));
		create.click();
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gender.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		firstname.sendKeys("Manimekala");
		WebElement lastname = driver
				.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[3]/input"));
		lastname.sendKeys("c");
		WebElement password = driver
				.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[5]/input"));
		password.sendKeys("meka88");
		WebElement days = driver.findElement(By.id("days"));
		Select s = new Select(days);
		s.selectByValue("29");

		WebElement month = driver.findElement(By.id("months"));
		Select s1 = new Select(month);
		s1.selectByValue("7");
		WebElement year = driver.findElement(By.id("years"));
		Select s2 = new Select(year);
		s2.selectByValue("1988");
		WebElement address = driver
				.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[4]/input"));
		address.sendKeys("13,abcd st,mukkudal");
		WebElement address2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[5]/input"));
		address2.sendKeys("mukkudal");
		WebElement city = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[6]/input"));
		city.sendKeys("chennai");
		WebElement state = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[7]/div/select"));
        Select s3=new Select(state);
        s3.selectByValue("3");
		WebElement code = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
		code.sendKeys("00000");

		WebElement country = driver.findElement(By.xpath("//*[@id=\"id_country\"]"));
		Select s4=new Select(country);
		s4.selectByValue("21");
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("9876543210");
		WebElement register = driver.findElement(By.id("submitAccount"));
		register.click();
		Thread.sleep(3000);
		WebElement proceed3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));

        proceed3.click();
        Thread.sleep(2000);
        WebElement agree = driver.findElement(By.id("cgv"));
        agree.click();
        Thread.sleep(2000);
        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
        checkout.click();
        Thread.sleep(2000);
        WebElement payment = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a"));
        payment.click();
        WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        confirm.click();

	}
}
