package com.qa.api.gorest.pojo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.qa.api.gorest.restclient.RestClient;
import com.qa.api.gorest.util.TestUtil;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class UserResult {
	
	/**
	 * 	private String first_name;
	private String last_name;
	private String gender;
	private String dob;
	private String email;
	private String phone;
	private String website;
	private String address;
	private String status;
	private Links _links;
	 */

	@Test
	public void createUserWithFullJson() {
		String token = "_FWTKt73f0EeVrfWj7d3sKoLMnw_9dqVcs0k";

		Self sf = new Self("http://www.sf.com");
		Edit ed = new Edit("http://www.ed.com");
		Avatar av = new Avatar("http://www.av.com");

		Links ln = new Links(sf, ed, av);

		UserInfo uf = new UserInfo("Tom", "Peter", "male", "09-09-1998", "tom17@gmail.com", "89898899",
				"http://www.tom.com", "test address", "active", ln);

		String UserJsonPayload = TestUtil.getSerializedJSON(uf);
		System.out.println(UserJsonPayload);
		
		Map<String, String> authTokenMap = new HashMap<String, String>();
		authTokenMap.put("Authorization", "Bearer " + token);
//		Response response = RestClient.doPost("JSON", "https://gorest.co.in", "/public-api/users", authTokenMap, null, true, UserJsonPayload);
//		
//		System.out.println(response.getStatusCode());
//		System.out.println(response.prettyPrint());
		
		RestAssured.baseURI = "https://gorest.co.in";
		given().log().all()
		.contentType(ContentType.JSON)
		.header("Authorization", "Bearer _FWTKt73f0EeVrfWj7d3sKoLMnw_9dqVcs0k")
		.body(UserJsonPayload)
			.post("/public-api/users")
		.then()
			.assertThat()
				.contentType(ContentType.JSON)
				.statusCode(200);
		
	}

}
