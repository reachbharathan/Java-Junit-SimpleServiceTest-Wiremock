package wiremockTest;

import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public abstract class PlatformContractTestBase {

  private static String jsonRootPath = "src/test/resources/";
  public Properties property;
  public String baseUrl;

  @BeforeSuite
  public void setup() {
    property = new ConfigProperties().getProperty();
    baseUrl = property.getProperty("url") + property.getProperty("port") + "/";
  }

  public String getJson(String jsonName) {
    String json = null;
    try {
      json = new String(Files.readAllBytes(Paths.get(jsonRootPath + jsonName + ".json")));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return json;
  }
}
