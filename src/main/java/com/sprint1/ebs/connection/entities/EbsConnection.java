package com.sprint1.ebs.connection.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sprint1.ebs.connection.dto.Bill;
import com.sprint1.ebs.connection.dto.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

enum EconnectionType{
	phase1, phase2;
	}
	
@Table(name="connection")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class EbsConnection {
	@Id
	@GeneratedValue
	private Long connID;
	
	@OneToMany
	private Bill bill;

	@ManyToOne
	private Customer customer;
	
	@Enumerated(EnumType.STRING)
	
	private EconnectionType type;
	
}
