package com.sprint1.ebs.connection.service;

import com.sprint1.ebs.connection.entities.EbsConnection;
import com.sprint1.ebs.connection.exception.EbsCustomerIDNotFoundException;


public interface EbsConnectionService {	
	
	EbsConnection createEbsConnection(EbsConnection connection);
	EbsConnection getEbsConnectionById(Long id) throws EbsCustomerIDNotFoundException;
}

