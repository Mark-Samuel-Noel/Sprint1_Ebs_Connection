package com.sprint1.ebs.connection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprint1.ebs.connection.dto.Bill;
import com.sprint1.ebs.connection.exception.EbsConnectionIDNotFoundException;

@RestController
@RequestMapping("/connection")
public class EbsConnectionController1 {
	
	@Autowired
	EbsBillProxy1 proxy;
	
	@GetMapping("/customer/{custID}/connection/{connID}/billing") 
	public List<Bill> getAllBillForConnection(@PathVariable("custID") Long custID, @PathVariable("connID") Long connID) throws EbsConnectionIDNotFoundException {	
	return proxy.listAllBillsForConnection(connID);
	}
}

