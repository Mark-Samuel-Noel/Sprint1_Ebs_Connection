package com.sprint1.ebs.connection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sprint1.ebs.connection.entities.EbsConnection;
import com.sprint1.ebs.connection.exception.EbsConnectionIDNotFoundException;
import com.sprint1.ebs.connection.repo.EbsConnectionRepository;

public class EbsConnectionServiceImpl implements EbsConnectionService{
	
	@Autowired 
	private EbsConnectionRepository repo;

	@Override
	public EbsConnection getEbsConnection(Long id) throws EbsConnectionIDNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EbsConnection> listAllConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EbsConnection findById(long custID) {
		// TODO Auto-generated method stub
		return null;
	}

}
