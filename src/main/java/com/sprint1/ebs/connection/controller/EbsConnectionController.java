package com.sprint1.ebs.connection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sprint1.ebs.connection.exception.EbsCustomerIDNotFoundException;
import com.sprint1.ebs.connection.entities.EbsConnection;
import com.sprint1.ebs.connection.service.EbsConnectionService;

@RestController
@RequestMapping("/connection")
public class EbsConnectionController {
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	EbsConnectionService service;
	
	@PostMapping("/create_connection")
	public EbsConnection createEbsConnection(@RequestBody EbsConnection connection) {
		return service.createEbsConnection(connection);	
	}
	
	@GetMapping("/customer/{custID}/connection")
	public List<EbsConnection> getEbsConnection(@PathVariable("custID")Long custID) throws EbsCustomerIDNotFoundException {
		return service.getEbsConnectionByCustomerID(custID);
	}
}