package SanityTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class Contact_api {
	
	@Test(priority=13)
	 public void activity()
	 {
		 String jsonBody1 = "{\"Name\":{\"Name_First\":\"Software\",\"Name_Last\":\"team\"},\"Email\":\"softwareteam45@gmail.com\",\"PhoneNumber\":\"1234567890\",\"MultiLine\":\"for testing purpose\",\"REFERRER_NAME\":\"https://apollo2.humanbrain.in/\",\"ZS_IF_DOMAIN\":\"https://apollo2.humanbrain.in/\"}";
    	 Response response1 = RestAssured
             .given()
                 .auth()
                 .preemptive()
                 .basic("admin", "admin")
                 .contentType(ContentType.JSON)
                 .body(jsonBody1)
             .when()
                 .post("https://forms.zohopublic.eu/SGBC/form/Contactus1/formperma/lGv8C1vgoHfvyA6CsgqzrgDDC3KHairV96zZkQsRAQE/records");
    	 int statusCode1 = response1.getStatusCode();
    	 if (statusCode1 == 200) {
             System.out.println("API request to Contact form api passed. Status code: " + statusCode1);
         } else {
             System.out.println("API request to Contact form api failed. Status code: " + statusCode1);
         }
         Assert.assertEquals(statusCode1, 200, "API request to Contact form failed");  
	 }
}
