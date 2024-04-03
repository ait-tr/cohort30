package de.ait;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Setter
public class Person {
private String fName;
private String lName;
private  int age;
}
