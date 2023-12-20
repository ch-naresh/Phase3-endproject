package restassuredscripts;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class Assignment003 { 
	@Test(priority='1')

public void assignment003User()
{
RestAssured.given()
.baseUri("https://petstore.swagger.io/v2/user/Uname001")
.when()
.get()
.then()
.statusCode(200)
.log().all()
.body("username", Matchers.equalTo("Uname001"))
.body("email", Matchers.equalTo("Positive@Attitude.com"))
.body("userStatus", Matchers.equalTo(1))
;

}
}