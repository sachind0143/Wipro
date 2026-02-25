package selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_gmail {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
//	driver.get("https://workspace.google.com/intl/en-US/gmail/");
//	String mainWindow =driver.getWindowHandle();
//	driver.findElement(By.xpath("//*[@id=\"root\"]/gws-header/header/div/div[3]/span[3]/a/span")).click();
////	driver.findElement(By.className("button__content")).click();
////	Set <String> allWindows = driver.getWindowHandles();
//	String newWindow = driver.getWindowHandle();
//	if(!newWindow.equals(mainWindow)) {
//		driver.switchTo().window(newWindow);
//	}
	driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&dsh=S-200937200%3A1771223272273197&ifkv=ASfE1-p3Mn1oVKNVQnwtpCEHXDrNCPdht1WFs1PNTXHMYeMo2RKx1LCP76qyMfyCwSNECFSo8U68qg&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("sachindhu27@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
}
}
