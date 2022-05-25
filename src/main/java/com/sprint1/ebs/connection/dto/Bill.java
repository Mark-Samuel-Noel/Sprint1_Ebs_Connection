package com.sprint1.ebs.connection.dto;

import java.time.LocalDate;

<<<<<<< HEAD
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.sprint1.ebs.connection.entities.EbsConnection;

>>>>>>> 345f67ea8b04b5f6181c577aa997970c18b397ca
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Bill {
<<<<<<< HEAD
=======
    
>>>>>>> 345f67ea8b04b5f6181c577aa997970c18b397ca
    private Long billID;
    private double units;
    private LocalDate billGenerationDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean status; 
<<<<<<< HEAD
    private Long ebscCnnectionID;
=======
    
     private Long ebscCnnectionID;
>>>>>>> 345f67ea8b04b5f6181c577aa997970c18b397ca
}