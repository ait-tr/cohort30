package com.phonebook.restAssuredTests;

import com.phonbook.dto.AuthRequestDto;
import com.phonbook.dto.AuthResponseDto;
import com.phonbook.dto.ErrorDto;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class LoginTests extends TestBase {

    AuthRequestDto auth = AuthRequestDto.builder()
            .username("manuel@gmail.com")
            .password("Manuel12345$")
            .build();

    @Test
    public void loginSuccessTest() {

        AuthResponseDto dto = given()
                .contentType("application/json")
                .body(auth)
                .post("user/login/usernamepassword")
                .then()
                .assertThat().statusCode(200)
                .extract().response().as(AuthResponseDto.class);

        System.out.println(dto);
    }

    @Test
    public void loginSuccessTest2() {

        String responseToken = given()
                .contentType("application/json")
                .body(auth)
                .when()
                .post("user/login/usernamepassword")
                .then()
                .assertThat().statusCode(200)
                .body(containsString("token"))
                .extract().path("token");

        System.out.println(responseToken);
    }

    @Test
    public void loginWrongEmailTest_401() {

        ErrorDto errorDto = given()
                .contentType(ContentType.JSON)
                .body(AuthRequestDto.builder()
                        .username("manuel@gmailcom")
                        .password("Manuel12345$")
                        .build())
                .post("user/login/usernamepassword")
                .then()
                .assertThat().statusCode(401)
                .extract().response().as(ErrorDto.class);
//        System.out.println(errorDto.getError());
//        System.out.println(errorDto.getMessage());

        Assert.assertEquals(errorDto.getError(),"Unauthorized");
    }

    @Test
    public void loginWrongPasswordTest_401() {
        given()
                .contentType(ContentType.JSON)
                .body(AuthRequestDto.builder()
                        .username("manuel@gmail.com")
                        .password("Manuel12345")
                        .build())
                .post("user/login/usernamepassword")
                .then()
                .assertThat().statusCode(401)
                .assertThat().body("message",equalTo("Login or Password incorrect"));
    }

}

