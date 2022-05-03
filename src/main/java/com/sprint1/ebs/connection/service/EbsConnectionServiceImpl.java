package com.sprint1.ebs.connection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.ebs.connection.entities.EbsConnection;
import com.sprint1.ebs.connection.exception.EbsCustomerIDNotFoundException;
import com.sprint1.ebs.connection.repo.EbsConnectionRepository;

@Service
public class EbsConnectionServiceImpl implements EbsConnectionService{
	
	@Autowired 
    EbsConnectionRepository repo;

	@Override
	public EbsConnection createEbsConnection(EbsConnection connection) {
		// TODO Auto-generated method stub
		return repo.save(connection);
	}

	@Override
	public EbsConnection getEbsConnectionById(Long id) throws EbsCustomerIDNotFoundException {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(EbsCustomerIDNotFoundException::new);
	}
}
