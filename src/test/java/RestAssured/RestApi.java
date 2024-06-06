package RestAssured;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;

public class RestApi {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(Payload.addPlace())
				.when().post("maps/api/place/add/json")
				.then().assertThat().statusCode(200).extract().response().asString();

		System.out.println(response);

		JsonPath js = new JsonPath(response);
		String placeId=js.getString("place_id");
		System.out.println(placeId);
		String address = js.getString("address");
		System.out.println(address);

	}
}
