package com.qa.api.gorest.tests;

import java.util.HashMap;

import java.util.Map;

import com.qa.api.gorest.pojo.Order;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.api.gorest.pojo.User;
import com.qa.api.gorest.restclient.RestClient;
import com.qa.api.gorest.util.ExcelUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;

@Epic("create user go rest api feature implementation.....")
@Feature("create user api feature....")
public class CreateUserTest {

	String baseURI = "https://backoffice.tradelingstage.com/api/module-backoffice";
	String basePath = "/v1-get-order";
	String token = "2d0c2ce4e54ec81097041a3a0542d891";

	@DataProvider
	public Object[][] getUserData() {
		Object userData[][] = ExcelUtil.getTestData("userdata");
		return userData;
	}

	@Description("create a user api test...verify create user from post call....")
	@Severity(SeverityLevel.BLOCKER)
	@Test(dataProvider = "getUserData")
	public void createUserAPIPOSTTest(String firstname, String lastname, String gender, String dob, String email,
			String phonenumber, String website, String address, String status) {

		Map<String, String> authTokenMap = new HashMap<String, String>();
		authTokenMap.put("Authorization", "Bearer " + token);


		User user = new User(firstname, lastname, gender, dob, email, phonenumber, website, address, status);
		Response response = RestClient.doPost("JSON", baseURI, basePath, authTokenMap, null, true, user);
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());
		System.out.println("=============================");

	}



	@Test()
	public void tradelingTest() {

		Map<String, String> authTokenMap = new HashMap<String, String>();
		authTokenMap.put("x-jwt-token", token);
		authTokenMap.put("x-language", "en");
		authTokenMap.put("x-country", "ae");

		//String payload = "{\"id\":\"619b8b0815230ac37b87fca5\"}";
		Order order = new Order("619b8b0815230ac37b87fca5");
		Response response = RestClient.doPost("JSON", baseURI, basePath, authTokenMap, null, true, order);
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());
		System.out.println("=============================");

	}

}
