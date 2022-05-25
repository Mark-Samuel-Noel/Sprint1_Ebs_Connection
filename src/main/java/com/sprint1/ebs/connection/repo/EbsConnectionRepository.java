package com.sprint1.ebs.connection.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sprint1.ebs.connection.entities.EbsConnection;

public interface EbsConnectionRepository extends JpaRepository<EbsConnection, Long>{
	@Query
	List<EbsConnection> findByCustomerID(@Param (value="userid") Long custid);
<<<<<<< HEAD
=======
	
	//@Query("SELECT e FROM EbsConnection e WHERE e.customer.userID = :custID")
    //List<EbsConnection> findByCustomer(Long custID);
>>>>>>> 345f67ea8b04b5f6181c577aa997970c18b397ca
}