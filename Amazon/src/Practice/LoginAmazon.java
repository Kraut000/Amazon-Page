package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAmazon {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\eclipse-workspace\\Amazon\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]")).click();
		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("kraut000@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("Kraut@123");
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		
	}

}
