package de.ait.demouser.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder.*;

import static org.hamcrest.Matchers.is;


@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@DisplayName("Endpoint /users works:")
public class UserIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @Sql(scripts = {"/sql/schema.sql", "/sql/data.sql"})
    public void simple_test() throws Exception {
        mockMvc.perform(get("/api/users")).andDo(print());
    }


    @Test
    @Sql(scripts = {"/sql/schema.sql", "/sql/data.sql"})
    public void return_list_of_users() throws Exception {

        mockMvc.perform(get("/api/users"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", is(4)))
                .andExpect(jsonPath("$.[0].id", is(1)))
                .andExpect(jsonPath("$.[0].firstName", is("User1FN")))
                .andExpect(jsonPath("$.[1].id", is(2)))
                .andExpect(jsonPath("$.[2].id", is(3)))
                .andExpect(jsonPath("$.[3].id", is(4)));
    }


    @Test
    @Sql(scripts = {"/sql/schema.sql", "/sql/data.sql"})
    public void return_created_user() throws Exception {
        mockMvc.perform(post("/api/users")
                .contentType("application/json")
                .content("{\n" +
                        "  \"firstName\": \"FakeUser1\",\n" +
                        "  \"lastName\": \"FakeUser lastname1\",\n" +
                        "  \"email\": \"user@jetbrains.com\",\n" +
                        "  \"password\": \"1234\"\n" +
                        "}"))
                .andExpect(jsonPath("$.id",is(5)))
                .andExpect(status().isCreated());
    }
}



