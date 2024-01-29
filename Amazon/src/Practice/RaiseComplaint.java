package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RaiseComplaint {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\eclipse-workspace\\Amazon\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0.document.body.scrollHeight)", "");
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		driver.findElement(By.xpath("//span[@class=\"a-list-item a-color-secondary\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("kraut000@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("Kraut@123");
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		
		

	}


}
