package com.sprint1.ebs.connection.service;

import java.util.List;

import com.sprint1.ebs.connection.entities.EbsConnection;
import com.sprint1.ebs.connection.exception.EbsConnectionIDNotFoundException;


public interface EbsConnectionService {	
	EbsConnection getEbsConnection(Long id) throws EbsConnectionIDNotFoundException;
	List<EbsConnection> listAllConnection();
	EbsConnection findById(long custID);
}

