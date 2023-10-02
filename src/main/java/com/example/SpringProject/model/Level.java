package com.example.SpringProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="DEMAND_LEVEL")
public class Level {
    @Id
    @Column(name="LEVEL")
    private String level;

}
