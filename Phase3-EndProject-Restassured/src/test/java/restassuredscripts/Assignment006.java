package restassuredscripts;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Assignment006 {
	@Test(priority='1')

public void assignment005FindByStatus()
{
RestAssured.given()
.baseUri("https://petstore.swagger.io/v2/pet/findByStatus")
//.queryParam("status", "available")
//.queryParam("status", "pending")
.queryParam("status", "sold")
.when()
.get()
.then()
.statusCode(200)
.log().all()

;



}

@Test(priority='2')

public void assignment006Logout()
{
RestAssured.given()
.baseUri("https://petstore.swagger.io/v2/user/logout")
.when()
.get()
.then()
.statusCode(200)
.log().all()
.body("code", Matchers.equalTo(200))
.body("type", Matchers.equalTo("unknown"))
.body("message", Matchers.equalTo("ok"))
;

}
}