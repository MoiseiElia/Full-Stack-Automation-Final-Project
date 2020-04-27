package post_List;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.jsoup.Connection;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class post_List
{
    String baseURL = "http://localhost:9000";

    public static RequestSpecification request;
    public static Response response;

    @BeforeClass
    public void start()
    {
        RestAssured.baseURI = baseURL;
        request = RestAssured.given();
        request.header("Content-Type", "application/json");
    }

    @Test
    public void test01_noCourse()
    {
        JSONObject requestParams = new JSONObject();
        requestParams.put("firstName", "Yoni");
        requestParams.put("lastName", "Flenner");
        requestParams.put("email", "admin@yoniflenner.net");
        requestParams.put("programme", "Some Engineering");

        request.body(requestParams.toJSONString());
        response = request.post("/student");

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
        assertEquals(response.getStatusCode(), 201);
    }


    @Test
    public void test02_withCourse()
    {
        List<String> coursesList = new ArrayList<String>();
        coursesList.add("Java Course");
        coursesList.add("CSharp Course");
        coursesList.add("Python Course");

        JSONObject requestParams = new JSONObject();
        requestParams.put("firstName", "Moshe");
        requestParams.put("lastName", "Cohen");
        requestParams.put("email", "moshe@cohen.com");
        requestParams.put("programme", "BlahBlah");
        requestParams.put("courses", coursesList);

        request.body(requestParams.toJSONString());
        response = request.post("/student");

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
        assertEquals(response.getStatusCode(), 201);
    }
}
