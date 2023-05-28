package Register_Repository_Package;

public class Register_repository_class {
	public static String baseURI()
	{
		String baseURI="https://reqres.in/";
		return baseURI;
	}
	public static String requestBody()
	{
		String requestBody="{\r\n"
				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
				+ "    \"password\": \"pistol\"\r\n"
				+ "}";
		return requestBody;
	}
	public static String resource()
	{
		String resource="/api/register";
		return resource;
	}
	
}
