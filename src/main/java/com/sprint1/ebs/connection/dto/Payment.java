package com.sprint1.ebs.connection.dto;

import java.time.LocalDate;

<<<<<<< HEAD
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

>>>>>>> 345f67ea8b04b5f6181c577aa997970c18b397ca
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
<<<<<<< HEAD
	private Long paymentID;
	private Long billID;
=======

	private Long paymentID;
	
	private Long billID;

>>>>>>> 345f67ea8b04b5f6181c577aa997970c18b397ca
	private LocalDate paymentDate;
}