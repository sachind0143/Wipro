package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;



public class LoginSteps {
	WebDriver driver;
	@Given("the user is on the SauceDemo login page")
	public void openLogin() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
@When("the user enters the following credentials")
public void enterCredential(DataTable dataTable) {

	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	    for (Map<String, String> row : data) {
	    	driver.findElement(By.id("user-name")).clear();
	        driver.findElement(By.id("password")).clear();
	        
	        driver.findElement(By.id("user-name")).sendKeys(row.get("username"));
	        driver.findElement(By.id("password")).sendKeys(row.get("password"));

	        driver.findElement(By.id("login-button")).click();
	        if(driver.getCurrentUrl().equals("https://www.saucedemo.com/")) {
	        	String errorMsg = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
	            System.out.println("Invalid login for: " + row.get("username"));
	            System.out.println("Error message: " + errorMsg);
	            driver.navigate().refresh();
	        }else {
	        	assertTrue(driver.getCurrentUrl().contains("inventory"));
	        	driver.navigate().back();
	        }
	    }
	}

@Then("the result should be validated")
public void finishExecution() {
	driver.quit();
}

}

/*
	int rowCount = dataTable.height();
	for(int i =1;i<rowCount;i++) {
		String username = dataTable.cell(i, 0);
		String password = dataTable.cell(i, 1);
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		if(driver.getCurrentUrl().contains("inventory")) {
			assertTrue(driver.getCurrentUrl().contains("inventory"));
			driver.navigate().back();
		}else {
			assertTrue(driver.findElement(By.cssSelector("h3[data-test='error']")).isDisplayed());
		}
	}
	Feature: Multiple login attempts

  Scenario: Login with multiple username and password combinations
    Given the user is on the SauceDemo login page
    When the user enters multiple credentials
      |username         | password     |
      |user1			|password123   |
      |admin			|admin		   |
      | standard_user   | secret_sauce |
    Then login results should be validated
 */