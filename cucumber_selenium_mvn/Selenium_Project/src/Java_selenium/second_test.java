package Java_selenium;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class second_test {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().window().maximize();
//			driver.get("https://www.selenium.dev/about");
			driver.get("https://www.selenium.dev");
			System.out.println("Selenium.dev opened");
			Thread.sleep(1000);
			driver.navigate().to("https://www.selenium.dev/about/");
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.PAGE_DOWN).perform();
			System.out.println("Naviagted to /about");
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println("Exception Occured: "+e.getMessage());
		}finally {
			driver.quit();
		}
		
	}
}
