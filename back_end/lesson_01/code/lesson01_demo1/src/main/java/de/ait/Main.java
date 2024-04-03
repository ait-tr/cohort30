package de.ait;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

// Class obj

public class Main {
    public static void main(String[] args) throws IOException {
        Person person = Person.builder()
                .fName("Jack")
                .lName("Johnson")
                .age(20)
                .build();

        System.out.println(person);

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(person);

        System.out.println(jsonString);
        mapper.writeValue(new File("person.json"), person);

        /*
        try ( OutputStream os = new BufferedOutputStream(new FileOutputStream(new File("person.json"),true))){
            mapper.writeValue(os, person);

        } catch (Exception e){
            System.out.println();
        }

         */


    }
}