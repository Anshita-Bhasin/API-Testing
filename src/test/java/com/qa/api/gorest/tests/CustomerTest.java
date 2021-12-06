package com.qa.api.gorest.tests;

import com.qa.api.gorest.pojo.Customer;
import com.qa.api.gorest.pojo.Order;
import com.qa.api.gorest.pojo.User;
import com.qa.api.gorest.restclient.RestClient;
import com.qa.api.gorest.util.ExcelUtil;
import io.qameta.allure.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;


@Feature("customer smoke test...")
public class CustomerTest {

	String baseURI = "https://backoffice.tradelingstage.com/api/module-backoffice";
	String basePath = "/v1-list-customer";
	String token = "2d0c2ce4e54ec81097041a3a0542d891";

	@DataProvider
	public Object[][] getUserData() {
		Object userData[][] = ExcelUtil.getTestData("userdata");
		return userData;
	}


	@Description("create a user api test...verify customer api from post call....")
	@Test()
	public void customerTest() {

		Map<String, String> authTokenMap = new HashMap<String, String>();
		authTokenMap.put("x-jwt-token", token);
		authTokenMap.put("x-language", "en");
		authTokenMap.put("x-country", "ae");
		Customer customer = new Customer(50);
		Response response = RestClient.doPost("JSON", baseURI, basePath, authTokenMap, null, true, customer);
		int code=response.getStatusCode();
		System.out.println(response.getStatusCode());
		Assert.assertEquals(code,200);
		System.out.println(response.prettyPrint());
		System.out.println("=============================");

	}

}
