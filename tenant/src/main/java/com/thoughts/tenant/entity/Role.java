package com.thoughts.tenant.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Wed 21-Apr-2021 17:47
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "ROLE")
public class Role {
	
	@Id
	@Field(value = "ROLE_ID")
	private Long roleId;
	@Field(value = "ROLE_NAME")
	private String roleName;
}
