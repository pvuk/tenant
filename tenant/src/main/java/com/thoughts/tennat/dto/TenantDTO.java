package com.thoughts.tennat.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Wed 21-Apr-2021 16:28
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode(callSuper=false)
public class TenantDTO extends BaseDTO {
	
	private Long tenantId;
	private Long loginId;
	private String userName;
	private Date lastSuccessLogin;
	private Date lastFailedLogin;
	
	private String loginMessage;
}
