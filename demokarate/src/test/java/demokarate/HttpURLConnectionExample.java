package demokarate;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class HttpURLConnectionExample
 {

		private final String USER_AGENT = "Mozilla/5.0";

		/*public static void main(String[] args) throws Exception {

			HttpURLConnectionExample http = new HttpURLConnectionExample();

			System.out.println("Testing 1 - Send Http GET request");
			http.sendGet();
			
			System.out.println("\nTesting 2 - Send Http POST request");
			http.sendPost();

		}
*/
		// HTTP GET request
	//	@Test
		private void sendGet() throws Exception {

			//String url = "http://www.google.com/search?q=mkyong";
			String url = "http://dummy.restapiexample.com/api/v1/employees";
			
			
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			//add request header
		//	con.setRequestProperty("User-Agent", USER_AGENT);

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			//print result
			System.out.println(response.toString());

		}
		//@Test
		private void sendGet1() throws Exception {

			//String url = "http://www.google.com/search?q=mkyong";
			String url = "http://dummy.restapiexample.com/api/v1/employee/48517";
			
			
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			//add request header
		//	con.setRequestProperty("User-Agent", USER_AGENT);

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			//print result
			System.out.println(response.toString());

		}
		
		@Test
		public void RegistrationSuccessful()
		{		
			RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1/create";
			RequestSpecification request = RestAssured.given();

			JSONObject requestParams = new JSONObject();
			requestParams.put("name", "dsineshsss12323h4"); // Cast
			requestParams.put("salary", "1200");
			requestParams.put("age", "23");
			request.body(requestParams.toJSONString());
			Response response = request.post();

			int statusCode = response.getStatusCode();
			System.out.println("statusCode:"+statusCode);
			System.out.println("response:"+response.asString());
			String successCode = response.jsonPath().get("name");
			System.out.println("successCode:"+successCode);
			/*Assert.assertEquals( "Correct Success code was returned", successCode, "dsineshsss123234");*/
		}
		

}
