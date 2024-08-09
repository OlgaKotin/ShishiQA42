package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static interfaces.Path.PROPERTIES_PATH;

public class PropertiesReader {
    public static String getProperty(String fileName, String key){
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(PROPERTIES_PATH+fileName);
            properties.load(fileInputStream);
            return properties.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
