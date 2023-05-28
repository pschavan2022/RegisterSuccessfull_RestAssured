package Register_Common_Function_Package;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

public class Register_CommonFunction_Class {
  public static int statusCode(String baseURI,String requestBody,String resource)
  {
	   RestAssured.baseURI=baseURI;
	   int statusCode=given().header("Content-Type","application/json").body(requestBody).when().post(resource).then().extract().statusCode();
	   return statusCode;
   }
  public static String responseBody(String baseURI,String requestBody,String resource)
  {
	  RestAssured.baseURI=baseURI;
	  String responseBody=given().header("Content-Type","application/json").body(requestBody).when().post(resource).then().extract().response().asString();
      return responseBody;
  }
  
}
