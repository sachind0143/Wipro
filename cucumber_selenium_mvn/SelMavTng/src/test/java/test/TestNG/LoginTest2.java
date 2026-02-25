package test.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTest2 {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login");
	}
	@Test(dataProvider="CSVData")
	public void loginTest(String username, String password)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@DataProvider(name="CSVData")
	public Object[][] getCSVData()throws Exception
	{
		return CsvUtil.getCSVData("C:\\Users\\sachin\\eclipse-workspace\\SelMavTng\\TestData\\LoginData.csv");
	}
 
 
}

