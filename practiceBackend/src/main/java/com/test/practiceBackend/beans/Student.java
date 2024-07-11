package com.test.practiceBackend.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 100)
    @Min(0)
    private Integer grade;

    @Column(nullable = false)
    private Date endDate;

    public Student(int grade, Date endDate) {
        this.grade = grade;
        this.endDate = endDate;
    }
}
