package wiremockTest;

import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class VerifyUserDetails extends PlatformContractTestBase {

  public String completeUrl;

  @Test
  public void verify_Get_UserDetails() {
    completeUrl = baseUrl.concat("user/1");
    given().
        when().
        get(completeUrl).
        then().
        statusCode(200).
        body("id", equalTo("1")).
        body("login", equalTo("testdetective")).
        body("url", equalTo("www.testdetective.com"));
  }
}
