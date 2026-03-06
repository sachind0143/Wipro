package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class BaseTest {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @BeforeMethod
    public void setup() {

        logger.info("Thread ID: {} - Starting browser");

        driver.set(new ChromeDriver());
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().manage().window().maximize();

        logger.info("Navigating to SauceDemo site");
        getDriver().get("https://www.saucedemo.com/");
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void tearDown() {

        logger.info("Thread ID: {} - Closing browser");

        if (getDriver() != null) {
            getDriver().quit();
            driver.remove();
        }
    }
}