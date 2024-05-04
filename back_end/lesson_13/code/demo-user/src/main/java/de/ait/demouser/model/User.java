package de.ait.demouser.model;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    /*
    REST GET,POST,PUT,DELETE
    'POST /users/delete'  не по REST
    'DELETE /users/3

    GET /users/3/friends
    GET /companies/5/orders

     */

}
