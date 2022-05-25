package com.sprint1.ebs.connection.entities;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sprint1.ebs.connection.dto.Bill;
import com.sprint1.ebs.connection.dto.Customer;

>>>>>>> 345f67ea8b04b5f6181c577aa997970c18b397ca
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

enum EconnectionType{
	phase1, phase2;
	}
	
@Entity
@Table(name="ebs_connection1")
@Data
@AllArgsConstructor
@NoArgsConstructor
<<<<<<< HEAD
=======

>>>>>>> 345f67ea8b04b5f6181c577aa997970c18b397ca

public class EbsConnection {
	@Id
	@GeneratedValue
	private Long connID;
	
	@ElementCollection
	private List<Long> billID;
	private Long customerID;

	@Enumerated(EnumType.STRING)
	private EconnectionType type;
	
}