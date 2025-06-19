package utilities;

import net.datafaker.Faker;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();
    private static final String configFilePath = "configuration.properties";
    private static final Faker faker = new Faker(new Locale("en-US"));

    static {
        try {
            FileInputStream file = new FileInputStream(configFilePath);
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveProperties() {
        try (FileOutputStream outputFile = new FileOutputStream(configFilePath)) {
            properties.store(outputFile, "Updated Dynamic Properties");
        } catch (IOException e) {
            throw new RuntimeException("Error while updating configuration.properties file", e);
        }
    }

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }

    public static int getIntProperty(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }

    public static void saveToConfig(String key, String value) {
        properties.setProperty(key, value);
        saveProperties();
    }

    public static void saveToConfigIfAbsent(String key, String value) {
        if (properties.getProperty(key) == null) {
            properties.setProperty(key, value);
            saveProperties();
        }
    }

    public static void updateProperty(String keyword) {
        switch (keyword) {
            case "invalidUsername":
                String invalidUsername = faker.name().username();
                properties.setProperty(keyword, invalidUsername);
                break;
            case "invalidPassword":
                String invalidPassword = faker.internet().password() + ".Bf!";
                properties.setProperty(keyword, invalidPassword);
                break;
            default:
                throw new IllegalArgumentException("Unsupported property key: " + keyword);
        }
        saveProperties();
    }
}