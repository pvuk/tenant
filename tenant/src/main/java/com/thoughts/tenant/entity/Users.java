package com.thoughts.tenant.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Wed 21-Apr-2021 17:44
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "USERS")
public class Users {

	@Id
	private Long userId;
	private String userName;
}
