package Java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class resume_uploader {
public static void main(String[] args) throws InterruptedException{ 
	WebDriver driver = new ChromeDriver();
    try {
        driver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(1000);
        // Absolute path of resume.pdf
        String filePath = "C:\\Users\\sachin\\eclipse-workspace\\Selenium_Project\\src\\Resume\\Sachin_Resume.pdf";


        WebElement uploadElement = driver.findElement(By.id("file-upload"));
        uploadElement.sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();
        // Optional: verify upload success
        String uploadedFileName = driver.findElement(By.id("uploaded-files")).getText();
        System.out.println("Uploaded file: " + uploadedFileName);

    } finally {
        driver.quit();
    }
/*	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/upload");
	Thread.sleep(3000);
	WebElement upload = driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
	upload.sendKeys("\"C:\\Users\\sachin\\eclipse-workspace\\Selenium_Project\\src\\Resume\\Sachin_Resume.pdf\"");
	driver.findElement(By.id("file-submit")).submit();
//	location	C:\Users\sachin\eclipse-workspace\Selenium_Project\src\Resume\Sachin_Resume.pdf
	Thread.sleep(1000);
	driver.quit();
	*/
//	driver.findElement(By.id("file-upload")).sendKeys("\"C:\\Users\\sachin\\Desktop\\document\\RESUME\\Sachin_Resume.pdf\"");
}
}

