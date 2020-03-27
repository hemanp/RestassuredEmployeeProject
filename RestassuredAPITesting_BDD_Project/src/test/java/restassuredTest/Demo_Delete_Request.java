package restassuredTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;



public class Demo_Delete_Request {

	@Test
	public void deleteEmployeeRecord()
	{
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/12";
		
		Response response=
		
		given()
		
		.when()
				.delete()
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.log().all()
			.extract().response();
			
			String jsonAsString=response.asString();
			Assert.assertEquals(jsonAsString.contains("successfully! deleted Records"),true);
	}
	
	
}
