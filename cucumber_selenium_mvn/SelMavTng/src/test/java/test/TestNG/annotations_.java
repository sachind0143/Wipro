package test.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class annotations_ {
	WebDriver driver;
	@BeforeSuite
	public void connection() {
		//Runs Once before the entire test suite starts;
		WebDriverManager.chromedriver().setup();
//		System.out.println("Databse Connection,Global Setup");
	}
	@BeforeTest
//	public void beforeTest() {
//		//Runs before the <test>
//		System.out.println("Initial setup for a test group");
//	}
	@BeforeClass
	public void setup() {
		//Runs before the first test method in a class 
		System.out.println("Launiching Browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	//	Valid userName and Password
	@BeforeMethod
	public void openLoginPage() {
		System.out.println("Opening Login Page");
		driver.get("https://www.saucedemo.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("user-name")));
	}
	//	for invalid userName and password
	@Test(priority =1)
	public void validLoginTest() {
        System.out.println("Executing Valid Login Test");
    	driver.findElement(By.name("user-name")).sendKeys("standard_user");
    	driver.findElement(By.name("password")).sendKeys("secret_sauce");
    	driver.findElement(By.name("login-button")).submit();
    	String currentUrl = driver.getCurrentUrl();
    	//    	checking the Condition
    		Assert.assertTrue(currentUrl.contains("https://www.saucedemo.com/inventory.html"));
	}
	@Test(priority=2)
	public void InvalidLoginTest() {
		System.out.println("Executing InValid Login Test");
    	driver.findElement(By.name("user-name")).sendKeys("admin");
    	driver.findElement(By.name("password")).sendKeys("admin");
    	driver.findElement(By.name("login-button")).submit();
    	String currentUrl = driver.getCurrentUrl();
//    	Assert.assertTrue(currentUrl.contains("https://www.saucedemo.com/"));
    	Assert.assertEquals(currentUrl, "https://www.saucedemo.com/");
	}
	@Test(priority =3)
	public void EmptyUserName() {
		System.out.println("Entering valid Password but Empty Username");
    	driver.findElement(By.name("password")).sendKeys("secret_sauce");
    	driver.findElement(By.name("login-button")).submit();
    	String currentUrl = driver.getCurrentUrl();
    	Assert.assertTrue(currentUrl.contains("https://www.saucedemo.com/"));
	}
	@Test(priority=4)
	public void EmptyPassword() {
    	driver.findElement(By.name("user-name")).sendKeys("standard_user");
     	driver.findElement(By.name("login-button")).submit();
    	String currentUrl = driver.getCurrentUrl();
    	Assert.assertTrue(currentUrl.contains("https://www.saucedemo.com/"));
    	
	}
	@AfterClass
	public void tearDown() {
		System.out.println("Closing Browser");
		driver.quit();
	}
//	@AfterTest
//	public void afterTest() {
//		System.out.println("===Test Tag Finished===");
//	}
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("===Test Suite Finished===");
		
//	}
	
	
}
