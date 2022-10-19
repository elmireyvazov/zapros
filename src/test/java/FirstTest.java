import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

public class FirstTest {
    @Test
    public void getUsers(){
        given()
                .baseUri("https://reqres.in/")
                .basePath("/api/unknown/2")
                .contentType(ContentType.JSON)
                .when().get()
                .then().statusCode(200);
    }
}
