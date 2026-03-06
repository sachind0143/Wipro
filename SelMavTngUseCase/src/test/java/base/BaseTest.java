package base;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class BaseTest {
protected WebDriver driver;
public WebDriver getDriver() {
	return driver;
}
@BeforeClass
public void setUpEnvironment() {
	System.out.println("Environment setup before class");
}
@BeforeMethod
public void launchBrowser() {
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
}
@AfterMethod
public void closeBrowser() {
    driver.quit();
}

@AfterClass
public void tearDownEnvironment() {
    System.out.println("Cleanup after class");
}
}
