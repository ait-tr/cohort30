package de.ait.model;

import lombok.*;


//@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class User {
    private final String name;
    private String email;
}

