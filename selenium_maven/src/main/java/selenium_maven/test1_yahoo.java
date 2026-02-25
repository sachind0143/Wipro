package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1_yahoo {
public static void main(String[] args) throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.yahoo.com");
	Thread.sleep(3000);
	driver.findElement(By.id("login-container")).click();
	driver.findElement(By.id("login-username")).sendKeys("Sachind140@yahoo.com");
	driver.findElement(By.id("login-signin")).submit();
	Thread.sleep(2000);

	driver.findElement(By.id("login-passwd")).sendKeys("Yepp@724");
	driver.findElement(By.id("login-signin")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("ybarMailIndicator")).click();
	Thread.sleep(5000);
	driver.quit();
}
}
