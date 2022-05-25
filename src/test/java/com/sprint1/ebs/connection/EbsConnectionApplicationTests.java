package com.sprint1.ebs.connection;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.sprint1.ebs.connection.entities.EbsConnection;
import com.sprint1.ebs.connection.repo.EbsConnectionRepository;
import com.sprint1.ebs.connection.service.EbsConnectionServiceImpl;


@SpringBootTest
class EbsConnectionApplicationTests {
	
	@InjectMocks
	private EbsConnectionServiceImpl service;
	
	@Mock
    EbsConnectionRepository repo;
	
	List<EbsConnection> conn=new ArrayList<>();
	EbsConnection c1,c2,c3;
	
	@SuppressWarnings("deprecation")
	@Before(value="")
	public void init() {
	MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void contextLoads() {
	}
	
	@BeforeEach void setup() throws Exception{  
		List<Long> L1=new ArrayList<>();
		L1.add(1L);
		   c1 = new EbsConnection((long) 1,(List<Long>) L1,(long) 1, null) ;
		   c2 = new EbsConnection((long) 2,(List<Long>) L1,(long) 1,null) ;
		   c3 = new EbsConnection((long) 3,(List<Long>) L1,(long) 1,null) ;
		   conn.add(c1);
	      conn.add(c2);
	      conn.add(c3);
			
	  }
	
	@Test                                  
	void createBill(){
		List<Long> L1=new ArrayList<>();
		L1.add(1L);
		EbsConnection b = new EbsConnection((long) 1,(List<Long>) L1,(long) 1, null);
				when(repo.save(b)).thenReturn(b);
		assertEquals(service.createEbsConnection(b),b);
	}
	
	@Test void testListConnectionByCustID() throws Exception{             //Test Get Bills By Connection ID
		 List<EbsConnection> l2=new ArrayList<>();
		 l2.add(c2);
		 when(repo.findByCustomerID(c2.getCustomerID())).thenReturn(l2);
		 List<EbsConnection> bills1=new ArrayList<>();
		 bills1.add(c2);
		 assertEquals(bills1,service.getEbsConnectionByCustomerID(c2.getCustomerID()));
	 }
}