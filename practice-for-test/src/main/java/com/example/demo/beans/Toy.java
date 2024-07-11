package com.example.demo.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "toys")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 40)
    @Length(min = 1, max = 40)
    private String name;

    public Toy(String name) {
        this.name = name;
    }
}
