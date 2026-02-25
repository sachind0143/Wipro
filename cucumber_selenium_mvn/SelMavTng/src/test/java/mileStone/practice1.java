package mileStone;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import com.sun.org.apache.bcel.internal.generic.Select;

public class practice1 {
	public static void main(String[] args) {
//		1,2
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btn"))).click();
		WebElement message = driver.findElement(By.id("msg"));
		String actualMessage = message.getText();
		String ExpectedMessage = "Login Successful";
		Assert.assertEquals(actualMessage, ExpectedMessage);
//		3
		Alert alert = driver.switchTo().alert();
		alert.accept();
//		4
		WebElement frame = driver.findElement(By.id("Frame id"));
		driver.switchTo().frame(frame);
		driver.switchTo().defaultContent();
//		4
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for(String window:allWindow) {
			if(!window.contains(mainWindow)) {
				driver.switchTo().window(window);
			}
		}
		driver.close();
		driver.switchTo().window(mainWindow);
//		6
		WebElement dropdown =  driver.findElement(By.id("dropId"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("electronics");
	}
}
