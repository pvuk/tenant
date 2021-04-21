package com.thoughts.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thoughts.tennat.dto.TenantDTO;
import com.thoughts.tennat.service.TenantService;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Wed 21-Apr-2021 16:23
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class TenantServiceImpl implements TenantService {

	/**
	 * @see com.thoughts.service.TenantService#loginPage(java.lang.Long)
	 */
	@Override
	public TenantDTO loginPage(Long loginId) {
		TenantDTO build = TenantDTO.builder()
				.loginId(loginId)
				.userName("Admin")
				.loginMessage("Welcome to Happy World!")
				.build();
		return build;
	}

}
