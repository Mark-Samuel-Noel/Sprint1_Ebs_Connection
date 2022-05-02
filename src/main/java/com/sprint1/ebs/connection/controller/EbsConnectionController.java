package com.sprint1.ebs.connection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprint1.ebs.connection.exception.EbsConnectionIDNotFoundException;
import com.sprint1.ebs.connection.exception.EbsCustomerIDNotFoundException;
import com.sprint1.ebs.connection.entities.EbsConnection;
import com.sprint1.ebs.connection.service.EbsConnectionService;

@RestController
@RequestMapping("/connection")
public class EbsConnectionController {
	
	@Autowired
	EbsConnectionService service;
	
	@GetMapping("/customer/{custID}/connection")
	public EbsConnection getEbsConnection(@PathVariable("id") long custID) throws EbsConnectionIDNotFoundException {
		return service.findById(custID);
	}
		
	@GetMapping("/customer/{custID}/connection/{connID}/billing")
	public EbsConnection getEbsConnection2(@PathVariable("id") long connID) throws EbsConnectionIDNotFoundException {
		return service.findById(connID);
	}
}
