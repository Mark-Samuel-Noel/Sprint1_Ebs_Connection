package com.sprint1.ebs.connection.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends User{
	private String custName;
	private String phoneNumber;
	private String custAddress;
<<<<<<< HEAD
=======
	
>>>>>>> 345f67ea8b04b5f6181c577aa997970c18b397ca
	private List<Long> ebsConnectionID;
}