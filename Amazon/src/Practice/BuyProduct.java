package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyProduct {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\eclipse-workspace\\Amazon\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//Thread.sleep(1000);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		//search bluetooth on amazon.
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("bluetooth earphones oneplus");
		//click on search button
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		//Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
    	WebElement scroll=driver.findElement(By.xpath("(//span[contains(text(),'Bullets Z2 Bluetooth Wireless in Ear Earphones with Mic, Bombastic Bass - 12.4 Mm Drivers, 10 Mins Charge - 20 Hrs Music, 30 Hrs Battery Life (Beam Blue)')])[2]"));
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		
		//Thread.sleep(1000);
		//click on bluetooth device
		driver.findElement(By.xpath("(//span[contains(text(),'Bullets Z2 Bluetooth Wireless in Ear Earphones with Mic, Bombastic Bass - 12.4 Mm Drivers, 10 Mins Charge - 20 Hrs Music, 30 Hrs Battery Life (Beam Blue)')])[2]")).click();
	
		driver.findElement(By.xpath("(//span[contains(text(),'Sold by')])[1]")).click();
	
//		Select QuantityField= new Select(quantity);
//		//click on quantity field as 2.
//		QuantityField.selectByIndex(2);
//		// click on add cart button.
//		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
//		// click on cart button
//		driver.findElement(By.xpath("(//span[contains(text(),'Cart')])[12]")).click();
//		// click on checkout button
//		driver.findElement(By.xpath("(//input[@class=\"a-button-input\"])[24]")).click();
//		//Pass login email id
//		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("kraut000@gmail.com");
//		// click on click button.
//		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
//	
		
		
		
		
//		WebElement scrol1=driver.findElement(By.xpath("//span[@id=\"a-autoid-6-announce\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", scrol1);
//		
//		driver.findElement(By.xpath("//span[@id=\"a-autoid-6-announce\"]")).click();
//		driver.findElement(By.xpath("//a[@id=\"quantity_1\"]")).click();
//		driver.findElement(By.xpath("//input[@id=\"buy-now-button\"]")).click();

	}

}
