package com.sprint1.ebs.connection.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sprint1.ebs.connection.entities.EbsConnection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bill")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Bill {
    
    @Id
    @GeneratedValue
    private Long bill_id;
    private double units;
    private LocalDate billGenerationDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean status; 
    
    @ManyToOne
     private EbsConnection ebsconnection;
}