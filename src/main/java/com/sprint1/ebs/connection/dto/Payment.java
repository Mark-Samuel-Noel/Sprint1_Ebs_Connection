package com.sprint1.ebs.connection.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
	@Id
	@GeneratedValue
	private Long payment_id;
	
	@OneToOne
	private Bill bill;

	private LocalDate paymentDate;
}