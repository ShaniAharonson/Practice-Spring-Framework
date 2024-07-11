package com.example.demo.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Entity
@Table(name = "cats")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 40)
    @Length(min = 1, max = 40)
    private String name;
    @Min(0)
    private Float weight;
    @ManyToMany(cascade = CascadeType.ALL)
    @Singular
    private List<Toy> toys;
}
