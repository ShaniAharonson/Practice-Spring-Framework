package com.cat.beckend.Beans;

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
    private Integer id;
    @Column(nullable = false, length = 40)
    @Length(max = 5)
    private String name;
    @Min(0)
    private Float weight;
    @ManyToMany (cascade = CascadeType.ALL)
    @Singular // to add something single to the builder
    private List<Toy> toys;

}
