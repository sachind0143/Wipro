package Java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
public static void main(String[] args) throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	
	driver.findElement(By.name("email")).sendKeys("7987128827");
	Thread.sleep(1000);
	driver.findElement(By.className("a-button-input")).click();
	
	driver.findElement(By.name("password")).sendKeys("Sachin-14");
	Thread.sleep(500);
	driver.findElement(By.className("a-button-input")).submit();
	Thread.sleep(500);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook air m4");
	driver.findElement(By.id("nav-search-submit-button")).submit();
	Thread.sleep(1000);
	driver.findElement(By.name("submit.addToCart")).click();
	Thread.sleep(1000);
	driver.quit();
}
}
