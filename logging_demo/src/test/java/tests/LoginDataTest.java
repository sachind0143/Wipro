package tests;

import base.BaseTest;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataTest extends BaseTest {

    @DataProvider(name = "loginData", parallel = true)
    public Object[][] getLoginData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"user1", "secret_sauce"},
                {"problem_user", "pswd1"},
                {"", ""}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {

        logger.info("Thread ID: {} - Executing login test with user: {}",
                 username);

        LoginPage loginPage = new LoginPage(getDriver());

        try {
            loginPage.enterUsername(username);
            loginPage.enterPassword(password);
            loginPage.clickLogin();

            boolean status = loginPage.isLoginSuccessful();

            logger.info("Login status for user {} : {}", username, status);

            // Expected: Only standard_user and problem_user should login
            if (username.equals("standard_user")) {
                Assert.assertTrue(status, "Login should succeed");
                logger.info("Assertion Passed for {}", username);
            } else {
                Assert.assertFalse(status, "Login should fail");
                logger.info("Assertion Passed (Expected Failure) for {}", username);
            }

        } catch (Exception e) {

            logger.error("Exception occurred during login test for user: {}",
                    username, e);

            Assert.fail("Test failed due to exception");
        }
    }
}