package com.test.practiceBackend.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "lectures")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Min(1)
    private Double salary;

    @OneToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @Singular
    private List<Student> students;
}
