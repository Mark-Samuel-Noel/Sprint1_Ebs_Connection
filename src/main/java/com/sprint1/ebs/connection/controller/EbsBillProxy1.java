package com.sprint1.ebs.connection.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.sprint1.ebs.connection.dto.Bill;

@FeignClient(name="ebs-bill")
public interface EbsBillProxy1 {
	@GetMapping("/electricity-billing-service/billing/connection/{connID}/list-all")
	public List<Bill> listAllBillsForConnection(@PathVariable("connID") Long connID);
}