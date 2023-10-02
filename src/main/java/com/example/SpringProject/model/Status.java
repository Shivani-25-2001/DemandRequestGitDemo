package com.example.SpringProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="STATUS")
public class Status {
    @Id
    @Column(name="STATUS")
    private String status;
}
