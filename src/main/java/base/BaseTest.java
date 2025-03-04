package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.ImageHtmlEmail;
import org.apache.commons.mail.resolver.DataSourceUrlResolver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.ConfigReader;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class BaseTest {

    public static AndroidDriver driver;
    public static UiAutomator2Options options;
    private static AppiumDriverLocalService service;

    @BeforeSuite(groups= {"regression"})
    public void setupSuite() {
        System.out.println("Test Suite Setup - Run Once Before Suite");


        // Suppress output by redirecting System.out to a dummy stream
        PrintStream dummyStream = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) {
                // Do nothing
            }
        });
        System.setOut(dummyStream);

        service = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")) // Update Appium Path
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withTimeout(Duration.ofSeconds(300)) // Ensure server doesn't time out
                .build();
        service.start();
        System.out.println("✅ Appium server started.");
        String folderPath = "/Users/Shubham.x.Jain/Desktop/Appium_Project/allure-results";
        // Replace with your folder path
        File folder = new File(folderPath);

        // Check if the folder exists and is a directory
        if (folder.exists() && folder.isDirectory()) {
            // Get all files in the folder
            File[] files = folder.listFiles();

            // Check if the directory is empty
            if (files != null && files.length > 0) {
                // Optionally delete the files (skip this if you need the results)
                for (File file : files) {
                    if (file.isFile()) {
                        if (file.delete()) {
                            System.out.println("Deleted file: " + file.getName());
                        } else {
                            System.out.println("Failed to delete file: " + file.getName());
                        }
                    }
                }
            } else {
                System.out.println("The folder is empty.");
            }
        } else {
            System.out.println("The provided path is not a valid directory.");

        }
        //System.out.println("Test Suite Setup - Run Once Before Suite");
    }

    @BeforeMethod(groups= {"regression"})
    public void startAppiumServer() throws MalformedURLException {
        options = new UiAutomator2Options();
        options.setPlatformName(ConfigReader.getProperty("platform.name"));
        options.setDeviceName(ConfigReader.getProperty("device.name"));
        options.setApp(ConfigReader.getProperty("app.path_PREPOD"));
        // options.setApp(ConfigReader.getProperty("app.path_UAT"));
        options.setAutoGrantPermissions(true);
        options.setNewCommandTimeout(Duration.ofSeconds(300)); // Prevent session timeout

        // Initialize the driver
        // Get and activate the current package
        driver = new AndroidDriver(new URL(ConfigReader.getProperty("appium.server")), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String currentPackage = driver.getCurrentPackage();
        driver.activateApp(currentPackage);

    }

    @AfterMethod(groups= {"regression"})
    public void tearDown(ITestResult result) throws InterruptedException {
        if (result.getStatus() == ITestResult.FAILURE) {
            // Implement screenshot capture if needed (AllureUtils or another utility)
            System.out.println("❌ Test Failed - Implement screenshot capture here.");
        }

        if (BaseTest.driver != null) {
            String currentPackage = BaseTest.driver.getCurrentPackage();
            BaseTest.driver.terminateApp(currentPackage);
            System.out.println("🛑 Terminated App: " + currentPackage);
            BaseTest.driver.quit();
            System.out.println("🚪 Closed the session.");
        }
    }


    @AfterSuite(groups= {"regression"})
    public void cleanupSuite() throws IOException, InterruptedException {

            // Generate the Allure report after ensuring allure-results is populated
            try {

               ProcessBuilder builder = new ProcessBuilder("/opt/homebrew/bin/allure", "serve", "allure-results");
                builder.inheritIO();
                Process process = builder.start();
               //process.waitFor();
                System.out.println("Successfully to serve the report.");

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Failed to serve the report.");
            }

            /*try{
               // URL url = new  URL("file:///"+System.getProperty("user.dir")+"/Users/Shubham.x.Jain/Desktop/Appium_Project/allure-report");
                URL url = new  URL("file:///Users/Shubham.x.Jain/Desktop/Appium_Project/allure-report/index.html");
        // Create the email message
        ImageHtmlEmail email = new ImageHtmlEmail();
        email.setDataSourceResolver(new DataSourceUrlResolver(url));
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("shubham180295@gmail.com","Sanu180295@"));
        email.setSSLOnConnect(true);
        email.setFrom("shubham180295@gmail.com"); //Sender
        email.setSubject("Test Results");
        email.setMsg("Please find Attached Report....");
        email.addTo("sanu180295@gmail.com"); //Receiver
        email.attach(url, "extent report", "please check report...");
        email.send(); // send the email
    }
		  catch(Exception e)
    {
        e.printStackTrace();
    }*/


        if (BaseTest.service != null) {
            BaseTest.service.stop();
            System.out.println("🛑 Appium server stopped.");
            BaseTest.driver.quit();
        }



        }
        }



