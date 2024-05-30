package de.ait.ec.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Course {
    // Hibernate
    public enum State{
        DRAFT,PUBLISHED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 25)
    private String title;

    @Column(nullable = false,length = 500)
    private String description;

    private LocalDate beginDate;  // begin_date
    private LocalDate endDate;

    @Column(nullable = false)
    private Double price;

    @Enumerated(value = EnumType.STRING)
    private State state;

    @ManyToMany(mappedBy = "courses")
    private Set<User> students;

    @OneToMany(mappedBy = "course")
    private Set<Lesson> lessons;
}
