package restassuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/*
given()
	set cookies, add auth, add param, set headers info etc....
when()
	get, post,put,delete...	
then()
	validate status code, extract response, extract headers cookies & response body....
 */

public class Demo_Get_Request {

	@Test
	public void getWeatherDetails(){
		
		given()
		. when()
		         .get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
		         .statusCode(200)
		         .statusLine("HTTP/1.1 200 OK")
		         .assertThat().body("City", equalTo("Hyderabad"))
		         .header("Content-Type","application/json");
		         
		
	}
	
}
