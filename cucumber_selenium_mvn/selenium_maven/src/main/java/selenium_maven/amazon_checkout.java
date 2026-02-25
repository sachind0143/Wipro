package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon_checkout {
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		
		driver.findElement(By.name("email")).sendKeys("7987128827");
		Thread.sleep(1000);
		driver.findElement(By.className("a-button-input")).click();
		
		driver.findElement(By.name("password")).sendKeys("Sachin-14");
		Thread.sleep(500);
		driver.findElement(By.className("a-button-input")).submit();
		Thread.sleep(500);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook air m4");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).submit();
		Thread.sleep(1000);
//		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[1]"));
//		dropDown.click();
//		Select select = new Select(dropDown);
//		select.selectByVisibleText("Best Sellers");
		
		driver.findElement(By.name("submit.addToCart")).click();
		driver.findElement(By.id("a-autoid-3-announce")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("nav-cart-count")).click();
		Thread.sleep(3000);
		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"sc-active-41d41982-d5d0-475b-8636-e68f656c772c\"]/div[4]/div/div[1]/label/i"));
		if(checkBox.isSelected()) {
			checkBox.click();
		}
//		driver.findElement(By.xpath()).click();
		Thread.sleep(3000);
		driver.findElement(By.className("a-button-input")).submit();
		Thread.sleep(5000);
		driver.quit();
//		//*[@id="ewc-compact-actions-container"]/div/div[2]/span/span/a
//		//*[@id="sc-active-41d41982-d5d0-475b-8636-e68f656c772c"]/div[4]/div/div[1]/label/i
	}
}
