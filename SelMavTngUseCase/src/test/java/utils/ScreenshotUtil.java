package utils;

import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

	public static void captureScreenshot(WebDriver driver, String testName) {

	    File folder = new File("screenshots");
	    if (!folder.exists()) {
	        folder.mkdir();
	    }

	    String timestamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss")
	            .format(new java.util.Date());

	    File src = ((TakesScreenshot) driver)
	            .getScreenshotAs(OutputType.FILE);

	    try {
	        FileUtils.copyFile(src,
	                new File("screenshots/" + testName + "_" + timestamp + ".png"));

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
    }
