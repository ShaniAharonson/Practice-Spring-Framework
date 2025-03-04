package com.example.restTemplate.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class YoutubeData {
    @Id
    private String id;
    private String name;
    @Column(length = 255)
    private String description;
    private String imageURL;
    private Date timeStamp;

}