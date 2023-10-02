package com.example.SpringProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="TECHNOLOGY")
public class Technology {
    @Id
    @Column(name="TECHNOLOGY")
    private String technology;
}
