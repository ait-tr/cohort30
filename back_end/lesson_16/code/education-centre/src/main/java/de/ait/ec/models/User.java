package de.ait.ec.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "account")
public class User {

    public enum Role{
        ADMIN, MANAGER, USER
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 25)
    private String firstName;

    @Column(length = 25)
    private String lastName;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Role role;

    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns =
            @JoinColumn(name = "student_id",nullable = false,referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn (name = "course_id",nullable = false,referencedColumnName = "id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"student_id","course_id"})
    )

    private Set<Course> courses;
}
