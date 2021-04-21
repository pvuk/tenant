package com.thoughts.tennat.service;

import com.thoughts.tennat.dto.TenantDTO;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Wed 21-Apr-2021 16:23
 */
public interface TenantService {

	/**
	 * @param loginId
	 * @return tenantDTO
	 * @author P.V. UdayKiran
	 * @since created on Wed 21-Apr-2021 16:27
	 */
	TenantDTO loginPage(Long loginId);

}
