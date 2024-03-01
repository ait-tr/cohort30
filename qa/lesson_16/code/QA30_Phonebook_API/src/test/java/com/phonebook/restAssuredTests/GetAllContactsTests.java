package com.phonebook.restAssuredTests;

import com.phonbook.dto.AllContactsDto;
import com.phonbook.dto.ContactDto;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAllContactsTests extends TestBase{

    @Test
    public void getAllContactSuccessTest() {

        AllContactsDto responseDto = given()
                .header("Authorization", token)
                .get("contacts")
                .then()
                .assertThat().statusCode(200)
                .extract().body().as(AllContactsDto.class);

        for (ContactDto contact: responseDto.getContacts()) {
            System.out.println(contact.getId() + "***" + contact.getName() + "***");
            System.out.println("==================================================");
        }
    }
}
