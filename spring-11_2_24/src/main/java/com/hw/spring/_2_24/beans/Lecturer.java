package com.hw.spring._2_24.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Table(name = "Lecturer")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    @Column(nullable = false, length = 40)
    private String name;
    @Column(nullable = false)
    private double Salary;
    @OneToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private List<Student> Student;
}
