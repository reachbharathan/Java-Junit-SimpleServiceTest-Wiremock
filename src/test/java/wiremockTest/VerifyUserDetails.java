package wiremockTest;

import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Package name wiremockTest
 * Created by Bharathan on 03/01/17.
 * Project Name simpleServiceTest
 */

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

  @Test
  public void verify_Post_AddNewUser() {
    completeUrl = baseUrl.concat("addNewUser");
    given().
        contentType("application/json").
        body(getJson("addNewUser")).
        when().
        post(completeUrl).
        then().
        statusCode(200).
        body("id", equalTo("2")).
        body("login", equalTo("lukaszroslonek")).
        body("url", equalTo("www.google.com"));
  }
}
