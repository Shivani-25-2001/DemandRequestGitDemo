package com.example.SpringProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="REQUESTED_BY")
public class RequestedBy {
    @Id
    @Column(name="REQUESTED_BY")
    private String requestedBy;
}
