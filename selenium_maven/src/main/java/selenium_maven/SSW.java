package selenium_maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


public class SSW {
	public static void main(String[] args) throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
//	Implicitly Wait
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("user-name")));
			
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
//	Thread.sleep(1000);
	driver.findElement(By.name("login-button")).submit();
	Thread.sleep(6000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("product_sort_container")));
	
//	driver.findElement(By.className("product_sort_container")).click();
////	Thread.sleep(500);
//	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
////	Thread.sleep(800);
	WebElement element = driver.findElement(By.className("product_sort_container"));
	Select select = new Select(element);
	select.selectByIndex(2);
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.PAGE_DOWN).perform();
	wait.until(ExpectedConditions.elementToBeClickable(By.name("add-to-cart-sauce-labs-backpack"))).click();
	
	driver.findElement(By.className("shopping_cart_link")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.name("checkout"))).click();

	driver.findElement(By.name("firstName")).sendKeys("User");

	driver.findElement(By.name("lastName")).sendKeys("xyz");
	
	driver.findElement(By.name("postalCode")).sendKeys("462023");
	driver.findElement(By.name("continue")).click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(By.name("finish"))).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.name("back-to-products"))).click();
	driver.quit();
	}
}
