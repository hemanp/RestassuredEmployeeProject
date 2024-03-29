package restassuredTest;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo_Post_Request {

	public static HashMap map=new HashMap();
	
	@BeforeClass
	public void postdata()
	{
		map.put("FirstName",RestUtils.getFirstName());
		map.put("LastName", RestUtils.getLastName());
		map.put("UserName", RestUtils.getUserName());
		map.put("Password", RestUtils.getPassword());	
		map.put("Email", RestUtils.getEmail());
		
		/*
		 * System.out.println(RestUtils.getFirstName());
		 * System.out.println(RestUtils.getLastName());
		 * System.out.println(RestUtils.getUserName());
		 * System.out.println(RestUtils.getPassword());
		 * System.out.println(RestUtils.getEmail());
		 */
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
	}
	
	
	@Test
	public void testPost()
	{
		given()
		.contentType("application/json")
		.body(map)
	
	.when()
	
		.post()
			
	.then()
		.statusCode(201)
		.and()
		.body("SuccessCode",equalTo("OPERATION_SUCCESS"))
		.and()
		.body("Message",equalTo("Operation completed successfully"));

	}
	
}
