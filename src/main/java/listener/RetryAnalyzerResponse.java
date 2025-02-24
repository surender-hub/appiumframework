package listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerResponse implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 1; // Retry failed tests twice

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true; // Retry test
        }
        return false;
    }
}