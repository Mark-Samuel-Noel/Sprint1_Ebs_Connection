package com.sprint1.ebs.connection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.ebs.connection.entities.EbsConnection;
import com.sprint1.ebs.connection.exception.EbsConnectionIDNotFoundException;
import com.sprint1.ebs.connection.repo.EbsConnectionRepository;

@Service
public class EbsConnectionServiceImpl implements EbsConnectionService{
	
	@Autowired 
    EbsConnectionRepository repo;

	@Override
	public EbsConnection createEbsConnection(EbsConnection connection) {
		return repo.save(connection);
	}
	
	@Override
	public EbsConnection listByID(Long connID) throws EbsConnectionIDNotFoundException {
		return repo.findById(connID).orElseThrow(EbsConnectionIDNotFoundException::new);
	}

	@Override
	public List<EbsConnection> getEbsConnectionByCustomerID(Long custID) {
		return repo.findByCustomerID(custID);
	}
}