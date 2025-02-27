package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        try {
            FileInputStream file = new FileInputStream("src/main/resources/config.properties");
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        String value = properties.getProperty(key);

        // Convert relative path to absolute path (for APK file)
        if (key.equals("app.path")) {
            File file = new File(value);
            return file.getAbsolutePath();
        }
        else if(key.equals("app.path2"))
        {
            File file = new File(value);
            return file.getAbsolutePath();
        }

        return value;
    }
}
