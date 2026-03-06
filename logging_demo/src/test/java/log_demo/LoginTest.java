package log_demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginTest {

	    private static final Logger logger =
	            LoggerFactory.getLogger(LoginTest.class);

	    public void testLogin() {
	        logger.info("Test started");
	        logger.warn("Password field is slow");
	        logger.error("Login failed");
	    }
	
}