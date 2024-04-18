package de.ait.our_first_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String helloMethod(){
        return "Hello everyone !";
    }

}
