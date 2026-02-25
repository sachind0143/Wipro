package Java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SSW {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(1500);
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	Thread.sleep(1000);
	driver.findElement(By.name("login-button")).submit();
	Thread.sleep(6000);
	driver.findElement(By.className("product_sort_container")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
//	Thread.sleep(800);
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(1500);
	driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("shopping_cart_link")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("checkout")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("firstName")).sendKeys("User");
	Thread.sleep(1000);
	driver.findElement(By.name("lastName")).sendKeys("xyz");
	Thread.sleep(1000);
	driver.findElement(By.name("postalCode")).sendKeys("462023");
	Thread.sleep(1000);
	driver.findElement(By.name("continue")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("finish")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("back-to-products")).click();

/*	String str = driver.getCurrentUrl();
	System.out.println(str);
	if(str.contains("https://www.saucedemo.com/inventory.html")) {
		System.out.println("Successfully Login");
	}
	else {
		System.out.println("Not Logged In");
		
	}
/*	
 	driver.findElement(By.name("user-name")).sendKeys("locked_out_user");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	Thread.sleep(1000);
	driver.findElement(By.name("login-button")).submit();
	Thread.sleep(2000);
	String str = driver.getCurrentUrl();
	System.out.println(str);
*/
		driver.quit();
}
}
