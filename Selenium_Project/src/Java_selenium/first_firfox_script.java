package Java_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class first_firfox_script {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		try {
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			String title = driver.getTitle();
			System.out.println("FireFox Browser");
			System.out.println("Page Title: "+title);
			if(title.contains("Google")) {
				System.out.println("Test Pass");	
			}else {
				System.out.println("Test Fail");
			}
		}catch(Exception e) {
			System.out.println("Exception Occured: "+e.getMessage());
		}
		finally {
			driver.quit();
		}
	}
}
