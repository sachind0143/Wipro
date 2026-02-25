package ApiTesting;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
public class Crud_Test2 {
@Test
public void postProduct() {
	String postBody="\"title\":\"Mac Book\"";
	given()
	.header("content-type","application/json")
	.body(postBody)
	
	.when()
	.post("https://dummyjson.com/products/add")
	
	.then()
	.statusCode(200)
	.body("title",equalTo("Mac Book"));
}
@Test
public void getAllProduct() {
	
	get("https://dummyjson.com/products/")
	.then()
	.log().all()
	.statusCode(200);
}
@Test
public void putProdcut() {
	String putBody = "{\"title\":\"Mac Book\"}";
	given()
		.log().all()
		.header("content-type","application/json")
		.body(putBody);
	when()
		.put("https://dummyjson.com/products/1")
	.then()
		.log().all()
		.statusCode(200);
}
@Test 
public void deleteProduct() {
	given()
		.when()
			.delete("https://dummyjson.com/products/1")
		.then()
			.statusCode(200)
			.body("id", equalTo(1));
}
}
