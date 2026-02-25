package ApiTesting;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
//import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Crud_test1 {
@Test
public void getUserTest() {
	
//   get element and match by equalTo();
 	 get("https://dummyjson.com/products")
	.then()
	.statusCode(200)
	.body("products[1].id",equalTo(2));

}
@Test
public void getAllUser() {
		
//	print all element return by get(RestAssured)
  	System.out.println(
			RestAssured.get("https://dummyjson.com/products")
			.asPrettyString()
			
			);
 
	}
@Test
public void postUser() {
		
// Post Request
	String requestBody = "{\n" +
            "  \"title\": \"BMW Pencil\",\n" +
            "  \"price\": 50\n" +
            "}";
            //for escaping "(double quotes) we using the \(backslash) before the double quotes;
	System.out.println(
			RestAssured.
			given()
			.header("content-type","application/json")
			.body(requestBody)
			.post("https://dummyjson.com/products/add")
	//converting the response to string ,Formats it nicely(pretty print);
	.asPrettyString()
	);
	//Directly printing the response 
//	.prettyPrint()
	//for small response not formatted
//	.asString()
	 
	}
@Test
public void updateUser() {
//	Put Request (Update)
	String body = "{\"title\": \"i phone 17\" }";
	 System.out.println(
			 RestAssured
			 .given()
			 .header("content-type","application/json")
			 .body(body)
			 .put("https://dummyjson.com/products/1")
			 .asPrettyString()
			 );

}
@Test
public void deleteUser() {
//	Delete Request
	System.out.println(
			RestAssured
			.delete("https://dummyjson.com/products/1")
			.asPrettyString());
  
}
}
