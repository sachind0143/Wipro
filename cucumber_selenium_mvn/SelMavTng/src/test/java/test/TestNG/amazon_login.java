package test.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;



import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon_login {
	WebDriver driver;
@BeforeSuite
public void global() {
	WebDriverManager.chromedriver().setup();
}
@BeforeClass
public void setup() {
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
}
@BeforeMethod
public void openSite() {
	driver.get("https://www.amazon.in/");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-logo-sprites")));
}
@Test
public void login() throws InterruptedException {
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	driver.findElement(By.name("email")).sendKeys("7987128827");
	driver.findElement(By.className("a-button-input")).click();
	Thread.sleep(600);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/form/div/div[1]/input")).sendKeys("Sachin-14");
	driver.findElement(By.id("signInSubmit")).click();
	
	Thread.sleep(1000);
	WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	Select select = new Select(dropdown);
	select.selectByValue("search-alias=electronics");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mac book air m4");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.name("submit.addToCart")).click();
	Thread.sleep(1500);
	driver.findElement(By.id("nav-cart")).click();
	Thread.sleep(1500);
	driver.findElement(By.name("proceedToRetailCheckout")).click();
	Thread.sleep(1500);
	driver.findElement(By.id("nav-cart-count-container")).click();
	Thread.sleep(1500);
	WebElement account = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions actions = new Actions(driver);
	actions.moveToElement(account).perform();
	Thread.sleep(1000);
	driver.findElement(By.id("nav-item-signout")).click();
	Thread.sleep(1500);
	driver.quit();
	
//	//*[@id="ap_password"]
}
}
