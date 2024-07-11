package com.exam.exam.beans;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false,length = 15)
    private String name;
    @Column(nullable = false)
    private Date birthday;
    @Column(nullable = false)
    private Boolean isActive;
    @OneToMany(cascade = CascadeType.ALL)
    @Singular
    private List<Grade> grades;
}
