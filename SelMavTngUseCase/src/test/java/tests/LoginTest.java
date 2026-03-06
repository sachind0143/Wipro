package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

@Listeners(utils.RetryListener.class)
public class LoginTest extends BaseTest {

	@DataProvider(name = "loginData")
	public Object[][] loginTestData(){
		return new Object[][] {
			{"wrong_user","secret_sauce","error"},
			{"standard_user","wrong_pswd","error"},
			{"","","empty"},
			{"standard_user","secret_sauce","sucess"}
			};
		}
	@Test(dataProvider = "loginData",retryAnalyzer = utils.RetryAnalyzer.class)
	public void loginTest(String username,String password, String expectedResult) {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickLogin();
		if(expectedResult.equals("success")) {
			Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"Login not successful");
		}else if(expectedResult.equals("error")) {
//			String error = login.getErrorMessage();
			Assert.assertTrue(false);
//			Assert.assertTrue(error.contains("Username and password do not match"),"Error message not displayed");
			
		}else if (expectedResult.equals("empty")) {

            String error = login.getErrorMessage();
            Assert.assertTrue(error.contains("Username is required"),
                    "Validation message not shown");
        }
	}
	}

