package com.sprint1.ebs.connection.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sprint1.ebs.connection.entities.EbsConnection;

public interface EbsConnectionRepository extends JpaRepository<EbsConnection, Long>{
	
}