package com.thoughts.tenant.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Wed 21-Apr-2021 17:45
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "USER_APP_ROLE")
public class UserAppRole {
	
	private Long userAppRoleId;
	private Long userId;
	private Long roleId;
}
