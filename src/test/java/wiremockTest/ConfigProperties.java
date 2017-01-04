package wiremockTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

/**
 * Package name wiremockTest
 * Created by Bharathan on 03/01/17.
 * Project Name simpleServiceTest
 */
public class ConfigProperties {

  FileInputStream fileInputStream;
  String inputFilePath;
  String propertyName = "local";

  public Properties getProperty() {
    inputFilePath = "src/test/resources/" + propertyName + ".properties";
    try {
      fileInputStream = new FileInputStream(inputFilePath);
    } catch (FileNotFoundException e) {
      System.out.println("--- Unable to find the property file path---");
      e.printStackTrace();
    }
    Properties property = new Properties();
    try {
      property.load(fileInputStream);
    } catch (IOException e) {
      System.out.println("--- Unable to load the property file ---");
      e.printStackTrace();
    }
    return property;
  }
}
