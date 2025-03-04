package com.Cat.excerice.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "toys")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false,length = 40)
    private String name;

    public Toy(String name) {
        this.name = name;
    }
}
