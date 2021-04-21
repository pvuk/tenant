package com.thoughts.tenant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughts.tennat.dto.TenantDTO;
import com.thoughts.tennat.service.TenantService;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Wed 21-Apr-2021 16:21
 */
@RestController
@RequestMapping(value = "/login")
public class TenantController {
	
	@Autowired private TenantService tenantService;
	
	@GetMapping(value = "/welcome")
	public ResponseEntity<String> welcome() {
		return ResponseEntity.status(HttpStatus.OK).body("Hello ");
	}
	
	@GetMapping(value = "/details")
	public ResponseEntity<TenantDTO> loginPage() {
		Long loginId = 1L;
		return ResponseEntity.status(HttpStatus.OK).body(tenantService.loginPage(loginId));
	}
}
