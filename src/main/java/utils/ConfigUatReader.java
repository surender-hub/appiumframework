package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUatReader {
    private static Properties properties;

    /**
     * Loads properties file when first accessed
     */
    private static void loadProperties() {
        if (properties == null) {
            try {
                FileInputStream file = new FileInputStream("src/main/resources/config-uat.properties");
                properties = new Properties();
                properties.load(file);
                file.close();
            } catch (IOException e) {
                throw new RuntimeException("Failed to load config.properties file", e);
            }
        }
    }

    /**
     * Fetches property value by key
     * @param key property key
     * @return property value
     */
    public static String getProperty(String key) {
        loadProperties();  // Ensure properties are loaded

        String value = properties.getProperty(key);
        if (value == null) {
            throw new RuntimeException("Property not found: " + key);
        }
        // Convert relative path to absolute path (for APK file paths)
        if (key.startsWith("app.path")) {
            File file = new File(value);
            return file.getAbsolutePath();
        }

        return value;
    }
}