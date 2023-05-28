package Register_Test_class;

import org.testng.Assert;

import Register_Common_Function_Package.Register_CommonFunction_Class;
import Register_Repository_Package.Register_repository_class;
import io.restassured.path.json.JsonPath;

public class Register_Test {
	public static void execute()
	{
		String baseURI=Register_repository_class.baseURI();
		String resource=Register_repository_class.resource();
		String requestBody=Register_repository_class.requestBody();
		int statusCode=Register_CommonFunction_Class.statusCode(baseURI, requestBody, resource);
		String responseBody=Register_CommonFunction_Class.responseBody(baseURI, requestBody, resource);
		
		JsonPath jspres=new JsonPath(responseBody);
		String res_email=jspres.getString("email");
		String res_password=jspres.getString("password");
		
		JsonPath jspreq=new JsonPath(responseBody);
		String req_email=jspreq.getString("email");
		String req_password=jspreq.getString("password");
		
		Assert.assertEquals(statusCode,200);
		Assert.assertEquals(res_email,req_email);
		Assert.assertEquals(res_password,req_password);
		System.out.println("regiter successfull :" +responseBody);
		//Assert.assertNotNull(res_password);
		
	}

}
