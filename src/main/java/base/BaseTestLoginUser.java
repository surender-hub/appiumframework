package base;

import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.*;
import utils.ConfigReader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


//@Listeners(utils.ListenerImplement.class)
public class BaseTestLoginUser {

    public static AndroidDriver driver;
    private static AppiumDriverLocalService service;

    @BeforeSuite
    public void setup() throws MalformedURLException
    {

        // Start Appium Server
//        service = new AppiumServiceBuilder()
//                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")) // Update Appium Path
//                .withIPAddress(ConfigReader.getProperty("appium.ip"))
//                .usingPort(Integer.parseInt(ConfigReader.getProperty("appium.port")))
//                .build();
//        service.start();
//        System.out.println("✅ Appium server started.");

        //String folderPath = "/Users/Shubham.x.Jain/Desktop/Appium_Project/allure-results";
        //String folderPath = System.getProperty("user.home") + "/Desktop/Appium_Project/allure-results";
       String folderPath = System.getProperty("user.home") + "/IdeaProjects/appiumframework/allure-results";
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

        // Set up driver options
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setPlatformName(ConfigReader.getProperty("platform.name"));
//        options.setDeviceName(ConfigReader.getProperty("device.name"));
//        options.setApp(ConfigReader.getProperty("app.path.UAT"));
//        options.setAutoGrantPermissions(true);
//        // Initialize the driver
//        driver = new AndroidDriver(new URL(ConfigReader.getProperty("appium.server")), options);
//        System.out.println("✅ AndroidDriver initialized.");
//
//        // Get and activate the current package
//        String currentPackage = driver.getCurrentPackage();
//        System.out.println("Current App package name: " + currentPackage);
//        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
//        driver.activateApp(currentPackage);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @BeforeTest
    public void activateApp() throws MalformedURLException {

        service = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")) // Update Appium Path
                .withIPAddress(ConfigReader.getProperty("appium.ip"))
                .usingPort(Integer.parseInt(ConfigReader.getProperty("appium.port")))
                .build();
        service.start();
        System.out.println("✅ Appium server started.");

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName(ConfigReader.getProperty("platform.name"));
        options.setDeviceName(ConfigReader.getProperty("device.name"));
        options.setApp(ConfigReader.getProperty("app.path.UAT"));
        options.setAutoGrantPermissions(true);
        // Initialize the driver
        driver = new AndroidDriver(new URL(ConfigReader.getProperty("appium.server")), options);
        System.out.println("✅ AndroidDriver initialized.");

        // Get and activate the current package
        String currentPackage = driver.getCurrentPackage();
        System.out.println("Current App package name: " + currentPackage);
        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
        driver.activateApp(currentPackage);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @AfterTest
    public void terminateApp()
    {
        System.out.println("🔻 Starting TearDown Process 🔻");

        if (driver != null) {
            String currentPackage = driver.getCurrentPackage();
            driver.terminateApp(currentPackage);
            System.out.println("🛑 Terminated App: " + currentPackage);
            driver.quit();
            System.out.println("🚪 Closed the session.");
        }

        // Stop Appium after each test
        if (service != null && service.isRunning()) {
            service.stop();
            System.out.println("🛑 Appium server stopped after test.");
        }
        System.out.println("✅ TearDown Completed!");
    }
    @AfterSuite
    public void tearDown() throws InterruptedException {


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

    }

}
