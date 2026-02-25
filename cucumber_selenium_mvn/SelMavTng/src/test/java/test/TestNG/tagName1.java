package test.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class tagName1
{
 
	@Test (dataProvider="loginData")
	public void loginTest(String username, String password) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login");
		
		driver.findElement(By.tagName("input")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.id("submit")).click();
		String msg = driver.getTitle();
		System.out.println(msg +username);
		driver.quit();
	}
		@DataProvider(name="loginData")
		public Object[][] getData()
		{
			return new Object[][]
		{
				{"student", "Password123"},	
//				{"user2", "pass2"},	
//				{"user3", "pass3"}	
 
		};
		
	}
	
	
}
