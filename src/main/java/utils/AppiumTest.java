package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class AppiumTest {
    private static final Logger logger = LoggerFactory.getLogger(AppiumTest.class);

    @Test
    public void testLogging() {
        logger.info("Starting Appium Test...");
        logger.debug("Debugging Appium Test...");
        logger.warn("This is a warning log!");
        logger.error("This is an error log!");
    }
}